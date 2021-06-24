package com.book.service;

import com.book.dto.BookProducts;
import org.springframework.stereotype.Component;

@Component
public interface BookService {
	BookProducts createBook(BookProducts book);
}
