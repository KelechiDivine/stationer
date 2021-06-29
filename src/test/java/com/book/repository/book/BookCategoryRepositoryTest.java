package com.book.repository.book;

import com.book.model.book.BookCategory;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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
		BookCategory bookCategory = bookCategoryRepository.findById("60da12fa321bae7f8b8a6d81").orElse(null);
		assertThat(bookCategory).isNotNull();
	}
	
	@Test
	public void testThatWeCanReadAllBooksCategory(){
		List<BookCategory> bookCategories = bookCategoryRepository.findAll();
		AssertionsForClassTypes.assertThat(bookCategories).isNotNull();
	}
}