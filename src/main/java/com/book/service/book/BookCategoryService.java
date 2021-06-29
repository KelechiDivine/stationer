package com.book.service.book;

import com.book.model.book.BookCategory;
import com.book.service.exception.BookException;

import java.util.List;

public interface BookCategoryService {
	
	void createBookCategory(BookCategory bookCategory);
	
	BookCategory findBookCategoryById(String id);
	
	List<BookCategory> findAllBookCategories();
	
	void deactivateBookCategory(String id);
	
	void updateBookCategory(BookCategory bookCategory) throws BookException;
	
	BookCategory findByBookCategoryName(String name);
}
