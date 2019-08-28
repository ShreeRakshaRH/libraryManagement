package com.capgemini.libraryManagement.dao;

import java.awt.print.Book;
import java.util.List;

import com.capgemini.libraryManagement.beans.Books;

public interface LibrarianDao {



	public void add(Book book);
	public void update(Book book);
	public List<Book> findAll();
	public Book findByTitle(String title);
	public List<Book> findByName(String name);
	public Boolean acceptRequest(Books title)  ;

}
