package com.book.model.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor

public class BookCategory {
	
	@Id
	private String id;
	
	@NonNull
	private String title;
	
	@NonNull
	private boolean isCurrent;
	
	@NonNull
	private String bookType;
	
	@NonNull
	private String brand;
	
	@NonNull
	private Set<Books> book;
	
	@NonNull
	private String registrationDate;
	
	
	public void setBooks(Books books){
		book.add(books);
	}
	
	
}
