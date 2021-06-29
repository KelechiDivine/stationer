package com.book.service.book;

import com.book.model.book.BookBrand;
import com.book.repository.book.BookBrandRepository;
import com.book.service.exception.BookException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookBrandServiceImpl implements BookBrandService {
	
	@Autowired
	BookBrandRepository bookBrandRepository;
	
	
	@Override
	public void createBookBrand(BookBrand bookBrand) {
		bookBrand.setActive(true);
		bookBrandRepository.save(bookBrand);
	}
	
	@Override
	public BookBrand findBookBrandById(String id) {
		return bookBrandRepository.findById(id).orElse(null);
	}
	
	@Override
	public List<BookBrand> findAllBookBrand() {
		return bookBrandRepository.findAll();
	}
	
	@Override
	public void discontinueBookBrand(String id) {
		bookBrandRepository.deactivateBookBrand(id);
	}
	
	@Override
	public void updateBookBrand(BookBrand bookBrand) throws BookException {
		bookBrandRepository.save(bookBrand);
	}
	
	@Override
	public BookBrand findBrandByBookBrandName(String name) {
		return bookBrandRepository.findBookBrandByBrandName(name);
	}
}
