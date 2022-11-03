package com.nagarro.part2.controllers;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.part2.entities.Books;
import com.nagarro.part2.services.BookService;


@RestController
public class BooksController {
	@Autowired
	private BookService service;
	
	
	@GetMapping("/books")
	public ResponseEntity <List<Books>> getBooks(){
		List<Books> list = service.getAllBooks(); 
		return ResponseEntity.of(Optional.of(list) );
	}
	
	@GetMapping("/books/{id}")
	public ResponseEntity <Books> getBook(@PathVariable("id") int id){
		Books book = service.getBookById(id); 
		return ResponseEntity.of(Optional.of(book) );
	}
	
	@PostMapping("/books")
	public ResponseEntity <Books> addBook(@RequestBody Books book){
		book.setDate(LocalDate.now());
		service.addBook(book);
		return ResponseEntity.of(Optional.of(book) );
	}
	
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable("id") int id) {
		service.deleteBooks(id);
	}
	
}
