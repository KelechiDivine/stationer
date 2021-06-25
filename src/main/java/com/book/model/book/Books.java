package com.book.model.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor

public class Books {
	
	@Id
	private String id;
	
	@NonNull
	private String summary;
	
	@NonNull
	private String publishedDate;
	
	@NonNull
	private boolean isCurrent;
	
	@NonNull
	private String bookNumber;
	
	@NonNull
	private String bookName;
	
	
	@NonNull
	private BookCategory bookCategory;
}
