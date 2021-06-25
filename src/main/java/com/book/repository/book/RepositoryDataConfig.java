package com.book.repository.book;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@ComponentScan
@EntityScan
@EnableMongoRepositories
@Configuration
@EnableAutoConfiguration
public class RepositoryDataConfig {
}
