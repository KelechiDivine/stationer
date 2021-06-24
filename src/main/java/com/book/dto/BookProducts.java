package com.book.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookProducts {
	
	@Id
	private String bookId;
	
	private String bookPrice;
	
	private String bookTitle;
	
	private String bookDescription;

}
