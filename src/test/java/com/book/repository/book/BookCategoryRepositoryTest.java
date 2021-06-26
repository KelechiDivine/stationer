package com.book.repository.book;

import com.book.model.book.BookCategory;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.AssertionsForClassTypes;
import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = RepositoryDataConfig.class)
@Slf4j


class BookCategoryRepositoryTest {
	
	@Autowired
	BookCategoryRepository bookCategoryRepository;
	
	BookCategory bookCategory;
	
	@BeforeEach
	void setUp() {
		bookCategory = new BookCategory();
	}
	
	@Test
	public void testThatWeCanFindBookCategoryById(){
		
		BookCategory bookCategory = bookCategoryRepository.findById("60d537f8c5a92712d4b85c25").orElse(null);
		assertThat(bookCategory).isNull();
		log.info("existed product category details --> {}", bookCategory);
	}
	
	@Test
	void deactivateById(){
		BookCategory bookCategory = bookCategoryRepository.findById("60d537f8c5a92712d4b85c25").orElse(null);
		assertNotNull(bookCategory);
		bookCategoryRepository.deleteByBrandAndId("60d537f8c5a92712d4b85c25");
		assertFalse(bookCategory.isCurrent());
	}
	@Test
	public void updateBookCategory(){
		bookCategory = bookCategoryRepository.findById("60d5747fc879241d6e134793").orElse(null);
		assertNotNull(bookCategory);
		bookCategory.setName("new name");
		bookCategoryRepository.update(bookCategory);
		assertThat(bookCategory.getName()).isEqualTo("new name");
		log.info("Book category after updating --> {}", bookCategory);
		
	}
	
	@Test
	public void testThatWeCanReadAllBooksCategory(){
		List<BookCategory> bookCategories = bookCategoryRepository.findAll();
		AssertionsForInterfaceTypes.assertThat(bookCategories).isNotNull();
		log.info("All book categories --> {}", bookCategories);
	}
	
	@Test
	public void testThatWeCanFindBooksCategoryByName(){
		bookCategory = bookCategoryRepository.findByName("new name");
		assertNotNull(bookCategory);
		assertThat(bookCategory.getName()).isEqualTo("new name");
	}
}