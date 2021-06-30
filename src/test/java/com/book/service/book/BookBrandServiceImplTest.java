package com.book.service.book;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@DataMongoTest
@ContextConfiguration(classes = ServiceDataConfig.class)

class BookBrandServiceImplTest {
	
	@BeforeEach
	void setUp() {
	}
}