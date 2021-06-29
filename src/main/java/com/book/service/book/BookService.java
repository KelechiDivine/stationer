package com.book.service.book;

import com.book.dto.RegisterBookDto;
import com.book.dto.UpdateBookDto;
import com.book.service.exception.BookException;

import java.awt.print.Book;
import java.util.List;

public interface BookService {
	
	void createBook(Book book);
	
	void registerBook(RegisterBookDto registerBookDto) throws BookException;
	
	Book findById(String id);
	
	Book findProductByName(String name);
	
	List<Book> findAllBooks();
	
	void discontinueBook(String id);
	
	void updateBook(UpdateBookDto updateBookDto) throws BookException;
}
