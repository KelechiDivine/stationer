package com.book.repository.book;

import com.book.model.book.BookBrand;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = RepositoryDataConfig.class)
@Slf4j

class BooksRepositoryTest {
	
	@Autowired
	BooksRepository booksRepository;
	
	@Autowired
	BookBrandRepository bookBrandRepository;
	
	@Autowired
	BookCategoryRepository bookCategoryRepository;
	
	BookBrand bookBrand;
	
	
	
	@Test
	public void testThatWeCanCreateABook(){
		bookBrand = new BookBrand();
		bookBrand.setBrandName("The life of a programmer.");
		bookBrand.setActive(true);
		assertDoesNotThrow(() ->
				bookBrandRepository.save(bookBrand));
		
		assertThat(bookBrand).isNotNull();
	}
	
	
	@Test
	public void testThatWeCanFindById(){
		bookBrand  = new BookBrand();
		bookBrand = bookBrandRepository.findById("60da12fa321bae7f8b8a6d81").orElse(null);
		assertThat(bookBrand).isNotNull();
	}
	
	@Test
	public void testThatTheBrandIsUpdated(){
		bookBrand =  bookBrandRepository.findById("60da12fa321bae7f8b8a6d81").orElse(null);
		assert bookBrand != null;
		bookBrand.setBrandName("life of a programmer.");
		bookBrand.setActive(true);
		
		assertDoesNotThrow(() ->
				bookBrandRepository.save(bookBrand));
		
		
		
		assertEquals(bookBrand.getBrandName(), "life of a programmer.");
	}
	
	@Test
	public void testThatBookBrandCanBeDeleted(){
		bookBrand = new BookBrand();
		bookBrand = bookBrandRepository.findById("60da12fa321bae7f8b8a6d81").orElse(null);
		bookBrandRepository.deleteById("60da12fa321bae7f8b8a6d81");
		assert bookBrand != null;
	}
	
	
}