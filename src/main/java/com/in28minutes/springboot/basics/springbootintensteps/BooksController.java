package com.in28minutes.springboot.basics.springbootintensteps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		return Arrays.asList(new Book(1l, "Pride and Prejudice","Jane Austin"));
	}
}
