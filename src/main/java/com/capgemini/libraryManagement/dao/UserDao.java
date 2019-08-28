package com.capgemini.libraryManagement.dao;

import java.util.List;

import com.capgemini.libraryManagement.beans.Books;
import com.capgemini.libraryManagement.beans.User;

public interface UserDao {
	
	
	
	public List<Books> getAllBooks();
	public User userLogin(User user) ;
	public Boolean updateUser( User userId)  ;
	public Boolean requestBook(String title)  ;
	public Boolean returnBook(Books bookId) ;
	public Boolean cancelRequest(Books bookId) ;
	

}
