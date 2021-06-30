package com.book.service.book;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@ComponentScan(basePackages = {"com.book.*"})
@EntityScan(basePackages = {"com.book.*"})
@EnableMongoRepositories(basePackages = {"com.book.*"})
@Configuration

class ServiceDataConfigTest {

}