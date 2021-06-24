package com.book.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@Document

public class Stationary {
	
	@Id
	@NonNull
	private String stationaryId;
	
	@NonNull
	private String registeredDate;
	

}
