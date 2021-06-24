package com.book.service;

import com.book.dto.BookProducts;
import com.book.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
	private final BookRepository bookRepository;
	
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@Override
	public BookProducts createBook(BookProducts book) {
		BookProducts newBook = new BookProducts();
		newBook.setBookPrice(book.getBookPrice());
		newBook.setBookTitle(book.getBookTitle());
		newBook.setBookDescription(book.getBookDescription());
		return newBook;
	}
}
