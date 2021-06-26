package com.book.repository.book;

import com.book.model.book.Books;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Repository
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
		books.setReleasedDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm: ss")));
		save(books);
	}
	
	
	Boolean existsByBookBrandBrandName(String name);
	
	Books findBooksByBookBrandBrandName(String name);
	
}
