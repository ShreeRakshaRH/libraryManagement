package com.capgemini.libraryManagement.dao;

import java.util.List;

import com.capgemini.libraryManagement.beans.User;

public interface AdminDao {

	
	public User adminLogin(User admin) ;
	public Boolean registerLibrarian( User librarian)  ;
	public Boolean registerUser( User user)  ;
	public Boolean deleteUser(String userId)  ;
	public Boolean searchUser( String userId)  ;
	public Boolean searchLibrarian(String LibrarianId)  ;
	public Boolean deleteLibrarian(String LibrarianId) ;
	public List<User> getAllLibrarian();
	public List<User> getAllUser();
	
	
	
}



