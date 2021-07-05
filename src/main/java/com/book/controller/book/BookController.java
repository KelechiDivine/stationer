//package com.book.controller.book;
//
//import com.book.dto.RegisterBookDto;
//import com.book.service.exception.BookException;
//import org.modelmapper.ModelMapper;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.context.request.WebRequest;
//
//import javax.validation.Valid;
//
//@RestController
//@RequestMapping("api/books")
//@CrossOrigin(origins = "http://localhost:3000")
//
//public class BookController {
//
//	@Autowired
//	BookServiceImpl bookService;
//	ModelMapper modelMapper = new ModelMapper();
//
//	@PostMapping("/create")
//
//	public ResponseEntity<?> registerProduct(@Valid @RequestBody RegisterBookDto registerBookDto, WebRequest webRequest) throws BookException{
//		if (!bookService.s)
//	}
//
//
//}
//
//
