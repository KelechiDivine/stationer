package com.book.repository;

import com.book.dto.BookProducts;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends MongoRepository<BookProducts, String> {
	Optional<BookProducts> findByBookPrice();
}
