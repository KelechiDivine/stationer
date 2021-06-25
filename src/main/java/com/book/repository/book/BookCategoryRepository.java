package com.book.repository.book;


import com.book.model.book.BookCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public interface BookCategoryRepository extends MongoRepository<BookCategory, String> {
	
	@Override
	default void deleteById(String s){}
	
	
	boolean existsByBrand(String name);
	
	
	default void deactivateById(String Id){
	BookCategory bookCategory= findById(Id).orElse(null);
	assert bookCategory != null;
	bookCategory.setCurrent(false);
	save(bookCategory);
	}
	
	
	default void update(BookCategory bookCategory){
		bookCategory.setRegistrationDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm: ss")));
		save(bookCategory);
	}
	
	BookCategory findByBrand(String name);
	
}
