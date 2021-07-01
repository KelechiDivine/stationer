package com.book.service.book;

import com.book.model.book.BookCategory;
import com.book.repository.book.BookCategoryRepository;
import com.book.repository.book.RepositoryDataConfig;
import com.book.service.exception.BookException;
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

import static org.mockito.Mockito.*;

@Slf4j
@DataMongoTest
@ContextConfiguration(classes = RepositoryDataConfig.class)

class BookCategoryServiceImplTest {
	
	@Mock
	BookCategoryRepository bookCategoryRepository;
	
	@InjectMocks
	BookCategoryServiceImpl bookCategoryService;
	
	BookCategory bookCategory;
	
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		bookCategory =new BookCategory();
	}
	
	@Test
	public void createBookProduct(){
		when(bookCategoryRepository.save(bookCategory)).thenReturn(bookCategory);
		bookCategoryService.createBookCategory(bookCategory);
		verify(bookCategoryRepository, times(1)).save(bookCategory);
	}
	
	@Test
	public void findBooksCategoryById(){
		when(bookCategoryRepository.findById(any())).thenReturn(Optional.of(bookCategory));
		bookCategoryService.findBookCategoryById(any());
		verify(bookCategoryRepository, times(1)).findById(any());
	}
	
	@Test
	public void findAllBooksCategories() {
		when(bookCategoryRepository.findAll()).thenReturn(List.of(bookCategory));
		bookCategoryService.findAllBookCategories();
		verify(bookCategoryRepository, times(1)).findAll();
	}
	
	@Test
	void deactivateBookCategory() {
		doNothing().when(bookCategoryRepository).deactivateById(any());
		bookCategoryService.deactivateBookCategory(any());
		verify(bookCategoryRepository, times(1)).deactivateById(any());
	}
	
	@Test
	void updateProductCategory() throws BookException {
		doNothing().when(bookCategoryRepository).update(any());
		bookCategoryService.updateBookCategory(any());
		verify(bookCategoryRepository, times(1)).update(any());
	}
	
	@Test
	void testFindByProductCategoryName(){
		when(bookCategoryRepository.findByName(any())).thenReturn(bookCategory);
		bookCategoryService.findByBookCategoryName(any());
		verify(bookCategoryRepository, times(1)).findByName(any());
	}
}