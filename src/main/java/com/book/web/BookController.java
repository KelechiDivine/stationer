package com.book.web;

import com.book.dto.BookProducts;
import com.book.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BookController {
	private final BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	@PostMapping("createbook")
	public ResponseEntity<?> createBook(@RequestBody BookProducts book){
		BookProducts newBook = bookService.createBook(book);
		return ResponseEntity.ok(newBook);
	}
}
