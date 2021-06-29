package com.book.model.book;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Books {
	
	@Id
	private String id;
	
	@NonNull
	private String summary;
	
	@NonNull
	private String bookSerialNumber;
	
	private boolean bookPages;
	
	@NonNull
	private BookCategory bookCategory;
	
	private BookBrand bookBrand;
	
	private boolean isCurrent;
	
	@NonNull
	private String isbnNumber;
	
	@NonNull
	private String releasedDate;
	
}
