package com.book.service.book;

import com.book.model.book.BookBrand;
import com.book.repository.book.BookBrandRepository;
import com.book.repository.book.RepositoryDataConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@Slf4j
@DataMongoTest
@ContextConfiguration(classes = RepositoryDataConfig.class)

class BookBrandServiceImplTest {
	
	@Mock
	BookBrandRepository bookBrandRepository;
	
	@InjectMocks
	BookBrandServiceImpl bookBrandServiceImpl;
	
	BookBrand bookBrand;
	
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		bookBrand = new BookBrand();
	}
	
	@Test
	void callTheCreateBookBrandService() {
		when(bookBrandRepository.save(bookBrand)).thenReturn(bookBrand);
		bookBrandServiceImpl.createBookBrand(bookBrand);
		verify(bookBrandRepository, times(1)).save(bookBrand);
	}
	
	@Test
	void findBookBrandById() {
		when(bookBrandRepository.findById(any())).thenReturn(Optional.of(bookBrand));
		bookBrandServiceImpl.findBookBrandById(any());
		verify(bookBrandRepository, times(1)).findById(any());
	}
	
	@Test
	void findAllBookBrands() {
		when(bookBrandRepository.findAll()).thenReturn(List.of(bookBrand));
		bookBrandServiceImpl.findAllBookBrand();
		verify(bookBrandRepository, times(1)).findAll();
	}
	
	@Test
	void   findBookBrandByBookBrandName(){
		when(bookBrandRepository.findBookBrandByBrandName(any())).thenReturn(bookBrand);
		bookBrandServiceImpl.findBrandByBookBrandName(any());
		verify(bookBrandRepository, times(1)).findBookBrandByBrandName(any());
	}
	
	
	
	
}