package com.book.service.book;

import com.book.model.book.Books;
import com.book.repository.book.BooksRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ContextConfiguration;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@Slf4j
@DataMongoTest
@ContextConfiguration(classes = ServiceDataConfig.class)

class BookServiceImplTest {
	
	@Mock
	BooksRepository booksRepository;
	
	@InjectMocks
	BookServiceImpl bookService;
	
	Books books;
	
	@BeforeEach
	void setUp(){
		MockitoAnnotations.openMocks(this);
		books = new Books();
	}
	
	@Test
	public void testThatWeCanFindByProductName(){
	when(booksRepository.findBooksByBookBrandBrandName(any())).thenReturn(books);
	bookService.findServiceByName(any());
	verify(booksRepository, times(1)).findBooksByBookBrandBrandName(any());
	}
}