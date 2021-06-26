package com.book.model.book;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor


public class BookBrand {
	
	@Id
	private String id;
	
	private String brandName;
	
	@NonNull
	private boolean isActive;
	
	@DBRef
	private Set<Books> book;
	
	
	public void setBooks(Books books) {
		if (book == null) {
			book = new HashSet<>();
		}
		book.add(books);
	}
	
}