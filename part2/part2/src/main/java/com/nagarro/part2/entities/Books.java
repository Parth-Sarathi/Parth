package com.nagarro.part2.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {

	@Id
	int BookCode ;
	@Override
	public String toString() {
		return "Books [BookCode=" + BookCode + ", BookName=" + BookName + ", Author=" + Author + ", date=" + date + "]";
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Books(int bookCode, String bookName, String author, LocalDate date) {
		super();
		BookCode = bookCode;
		BookName = bookName;
		Author = author;
		this.date = date;
	}
	public int getBookCode() {
		return BookCode;
	}
	public void setBookCode(int bookCode) {
		BookCode = bookCode;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	String BookName;
	String Author;
	LocalDate date;
}
