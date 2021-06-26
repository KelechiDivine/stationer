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

public class BookCategory {
	
	@Id
	private String id;
	
	@NonNull
	private String name;
	
	@NonNull
	private boolean isCurrent;
	
	@NonNull
	private String registeredDate;
	
	@NonNull
	private String modifiedDate;
	
}
