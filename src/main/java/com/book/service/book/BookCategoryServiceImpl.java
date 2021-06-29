package com.book.service.book;

import com.book.model.book.BookCategory;
import com.book.repository.book.BookCategoryRepository;
import com.book.service.exception.BookException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class BookCategoryServiceImpl implements BookCategoryService{
	
	@Autowired
	BookCategoryRepository bookCategoryRepository;
	
	public boolean bookCategoryDoesNotExist(String name){
		return !bookCategoryRepository.existsByName(name);
	}
	
	@Override
	public void createBookCategory(BookCategory bookCategory) {
		bookCategory.setCurrent(true);
		bookCategory.setRegisteredDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm: ss")));
		bookCategory.setModifiedDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm: ss")));
		bookCategoryRepository.save(bookCategory);
	}
	
	@Override
	public BookCategory findBookCategoryById(String id) {
		return bookCategoryRepository.findById(id).orElse(null);
	}
	
	@Override
	public List<BookCategory> findAllBookCategories() {
		return bookCategoryRepository.findAll();
	}
	
	@Override
	public void deactivateBookCategory(String id) {
		bookCategoryRepository.deactivateById(id);
	
	}
	
	@Override
	public void updateBookCategory(BookCategory bookCategory) throws BookException {
		bookCategoryRepository.update(bookCategory);
	}
	
	@Override
	public BookCategory findByBookCategoryName(String name) {
		return bookCategoryRepository.findByName(name);
	}
}
