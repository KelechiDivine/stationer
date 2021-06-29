package com.book.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterBookDto {
	
	private String id;
	
	@NonNull
	private String description;
	
	@NonNull
	private String isbnNumber;
	
	@NonNull
	private String bookName;
	
	@NonNull
	private String bookPages;
	
//	@NonNull
	private String bookBrand;
	
	
	
	
	
	
}
