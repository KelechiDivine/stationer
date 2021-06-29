package com.book.service.book;

import com.book.model.book.BookBrand;
import com.book.service.exception.BookException;

import java.util.List;

public interface BookBrandService {
	
	void createBookBrand(BookBrand bookBrand);
	
	BookBrand findBookBrandById(String id);
	
	List<BookBrand> findAllBookBrand();
	
	void discontinueBookBrand(String id);
	
	void updateBookBrand(BookBrand bookBrand) throws BookException;
	
	
	BookBrand findBrandByBookBrandName(String bookBrand);
}
