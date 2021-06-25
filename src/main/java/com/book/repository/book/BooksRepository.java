package com.book.repository.book;

import com.book.model.book.Books;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface BooksRepository extends MongoRepository<Books, String> {
	
	@Override
	default void deleteById(String id){
	}
	
	default void discontinueProduct(String s){
		Books books = findById(s).orElse(null);
		assert books != null;
		books.setCurrent(false);
		save(books);
	}
	
	default void updateProduct(Books books){
		books.setPublishedDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm: ss")));
		save(books);
	}
	
	
	Boolean existsByBookName(String name);
	
	Books findBooksByBookName(String name);
	
}
