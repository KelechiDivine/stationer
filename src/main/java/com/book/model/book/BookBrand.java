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
@Builder
@ToString


public class BookBrand {
	
	@Id
	private String id;
	
	private String brandName;
	
	@NonNull
	private  boolean isCurrent;
	
	@DBRef
	private Set<Books> book;
	
//	@NonNull
//	private BookCategory bookCategory;
	
	
	public void setBooks(Books books){
		if (book == null){
			 book = new HashSet<>();
		}
		book.add(books);
	}
}
