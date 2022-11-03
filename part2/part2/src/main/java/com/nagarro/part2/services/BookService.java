package com.nagarro.part2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.part2.dao.BooksRepo;
import com.nagarro.part2.entities.Books;

@Component
public class BookService {
	
	@Autowired
	private BooksRepo booksrepo;
	
	public List<Books> getAllBooks() {
		List<Books> list= (List<Books>)this.booksrepo.findAll();
		return list;
	}
	
	public Books getBookById(int id) {
		Books book=null;
		try {
			book = this.booksrepo.findById(id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	
	public Books addBook(Books b) {
		Books result = booksrepo.save(b)  ;
		return result;
	}
	
	public void deleteBooks(int bid) {
		booksrepo.deleteById(bid);
	}
	
	public void updateBook(Books book, int bookId) {
		book.setBookCode(bookId);
		
		booksrepo.save(book);
	}
}
