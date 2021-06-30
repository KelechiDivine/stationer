package com.book.service.book;

import com.book.dto.RegisterBookDto;
import com.book.dto.UpdateBookDto;
import com.book.model.book.Books;
import com.book.repository.book.BookCategoryRepository;
import com.book.repository.book.BooksRepository;
import com.book.service.exception.BookException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class BookServiceImpl implements  BookService{
	
	@Autowired
	BooksRepository booksRepository;
	
	@Autowired
	BookServiceImpl bookService;
	
	@Autowired
	BookCategoryRepository bookCategoryRepository;
	
	@Override
	public void createBook(Book book) {
	
	}
	
	@Override
	public void registerBook(RegisterBookDto registerBookDto) throws BookException {
	
	}
	
	@Override
	public Books findById(String id) {
		return booksRepository.findById(id).get();
	}
	
	@Override
	public Books findServiceByName(String name) {
		return booksRepository.findBooksByBookBrandBrandName(name);
	}
	
	@Override
	public List<Books> findAllBooks() {
		return booksRepository.findAll();
	}
	
	@Override
	public void updateBook(UpdateBookDto updateBookDto) throws BookException {
		Books existingBooks = booksRepository.findById(updateBookDto.getId()).orElse(new Books());
		
		if (!existingBooks.getIsActive()){
			throw new BookException("You can not update a product that has been discontinued");
		}
	
	}
	
}
