package com.capgemini.libraryManagement.beans;

import java.util.Date;

public class Library{
	
	private int registrationId;
	private int id;
	private int bookId;
	private int bookBorrowed;
	private Date registrationDate ;
	private Date issueDate;
	private Date returnDate;
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getBookBorrowed() {
		return bookBorrowed;
	}
	public void setBookBorrowed(int bookBorrowed) {
		this.bookBorrowed = bookBorrowed;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

}
