package com.book.service.book;

import com.book.dto.RegisterBookDto;
import com.book.dto.UpdateBookDto;
import com.book.model.book.Books;
import com.book.service.exception.BookException;

import java.awt.print.Book;
import java.util.List;

public interface BookService {
	
	void createBook(Book book);
	
	void registerBook(RegisterBookDto registerBookDto) throws BookException;
	
	Books findById(String id);
	
	Books findServiceByName(String name);
	
	List<Books> findAllBooks();
	

	
	void updateBook(UpdateBookDto updateBookDto) throws BookException;
}
