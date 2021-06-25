package com.book.repository.book;

import com.book.model.book.BookBrand;
import com.book.model.book.BookCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest(classes = RepositoryDataConfig.class)
@Slf4j


class BookBrandRepositoryTest {
	
	@Autowired
	BooksRepository booksRepository;
	
	@Autowired
	BookCategoryRepository bookCategoryRepository;
	
	@Autowired
	BookBrandRepository bookBrandRepository;
	
	BookBrand bookBrand;

	
	@BeforeEach
	void setUp() {
		bookBrand = new BookBrand();
	}
	
	@Test
	public void testThatWeCanCreateABookBrand(){
//	BookBrand bookBrand =bookBrandRepository.findById()
	bookBrand.setCurrent(false);
	bookBrand.setBrandName("Kelechi brand");
	
	bookBrand = BookBrand.builder()
			.brandName("kelechibrand")
			.build();
	
	bookBrandRepository.save(bookBrand);
	assertThat(bookBrand).isNotNull();
	log.info("book brand --> {}", bookBrand);
	
	}
}