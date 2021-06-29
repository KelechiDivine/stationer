package com.book.repository.book;

import com.book.model.book.BookBrand;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.AssertionsForClassTypes;
import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


@SpringBootTest(classes = RepositoryDataConfig.class)
@Slf4j


class BookBrandRepositoryTest {
	
	@Autowired
	BookBrandRepository bookBrandRepository;
	
	@Autowired
	BooksRepository booksRepository;
	
	BookBrand bookBrand;

	
	@BeforeEach
	void setUp() {
		bookBrand = new BookBrand();
	}
	
	@Test
	public void testThatWeCanCreateABookBrand(){
	bookBrand.setBrandName("The cry of an Africa child");
	bookBrand.setActive(true);
	assertDoesNotThrow(()-> {
			bookBrandRepository.save(bookBrand);
		});

	assertThat(bookBrand).isNotNull();
	log.info("book brand --> {}", bookBrand);
	}
	
	@Test
	public void testThatWeCanFindById(){
		
		BookBrand foundBrand = bookBrandRepository.findById("60d537f8c5a92712d4b85c25")
				.orElse(null);
		assertThat(foundBrand).isNotNull();
		log.info("existed brand details --> {}", foundBrand);
	}
	
	@Test
	public void testThatWeCanDeactivateBook(){
		
		AssertionsForClassTypes.assertThat(bookBrandRepository.existsById("60d537f8c5a92712d4b85c25")).isTrue();
		BookBrand bookBrand = bookBrandRepository.findById("60d537f8c5a92712d4b85c25").orElse(null);
		bookBrandRepository.deactivateBookBrand("60d537f8c5a92712d4b85c25");
		assert  bookBrand != null;
	}
	
	@Test
	public void testThatWeCanUpdateABookBrand(){
		bookBrand = bookBrandRepository.findById("60d5747fc879241d6e134793").orElse(null);
		AssertionsForClassTypes.assertThat(bookBrand).isNotNull();
		bookBrand.setActive(true);
		bookBrandRepository.save(bookBrand);
		AssertionsForClassTypes.assertThat(bookBrand).isNotNull();
		log.info("Brand after updating  --> {}", bookBrand);
	
	}
	
	@Test
	public void testThatWeCanReadAllBookBrand(){
		List<BookBrand> bookBrands = bookBrandRepository.findAll();
		AssertionsForInterfaceTypes.assertThat(bookBrands).isNotNull();
		log.info("All book brands --> {}", bookBrands);
	}
}