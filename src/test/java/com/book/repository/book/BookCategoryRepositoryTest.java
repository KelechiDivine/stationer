package com.book.repository.book;

import com.book.model.book.BookCategory;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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
	public void testThatWeCanReadAllBooksCategory(){
		List<BookCategory> bookCategories = bookCategoryRepository.findAll();
		AssertionsForClassTypes.assertThat(bookCategories).isNotNull();
	}
}