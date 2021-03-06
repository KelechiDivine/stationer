package com.book.repository.book;

import com.book.model.book.BookBrand;
import lombok.NonNull;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookBrandRepository extends MongoRepository<BookBrand, String> {
	
	@Override
	default void deleteById(@NonNull String s){}
	
	default  void deactivateBookBrand(String id){
		BookBrand bookBrand =findById(id).orElse(null);
		assert bookBrand != null;
		bookBrand.setActive(false);
		save(bookBrand);
	}
	BookBrand findBookBrandByBrandName(String name);
	boolean existsBookBrandByBrandName(String name);
}






