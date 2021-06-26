package com.book.repository.book;


import com.book.model.book.BookCategory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Repository
public interface BookCategoryRepository extends MongoRepository<BookCategory, String> {
	
	@Override
	default void deleteById(String s){}
	
	
	boolean existsByName(String name);
	
	
	default void deleteByBrandAndId(String Id){
	BookCategory bookCategory= findById(Id).orElse(null);
	assert bookCategory != null;
	bookCategory.setCurrent(false);
	save(bookCategory);
	}
	
	
	default void update(BookCategory bookCategory){
		bookCategory.setModifiedDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm: ss")));
		save(bookCategory);
	}
	
	BookCategory findByName(String name);
	
}
