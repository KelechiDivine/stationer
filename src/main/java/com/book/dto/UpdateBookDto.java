package com.book.dto;

import com.book.model.book.BookBrand;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UpdateBookDto {
	
	@NotNull
	private String id;
	
	private String isbnNumber;
	
	private String bookName;
	
	private String bookWeight;
	
	private BookBrand bookBrand;
	
}
