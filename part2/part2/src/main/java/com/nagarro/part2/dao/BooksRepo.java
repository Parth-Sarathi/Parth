package com.nagarro.part2.dao;

import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;

import com.nagarro.part2.entities.Books;

public interface BooksRepo extends CrudRepository<Books, Integer> {

	public Books findById(int id);    //optional method to finf books by specifying ID
}
