package com.book.dto;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Reader {
	
	@Id
	@NonNull
	private String readerId;
	
	@NonNull
	private String readerName;
	
}
