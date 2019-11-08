package com.example.books.model;

public class Book {
	String id;
	String name;
	String author;
	String authorEmail;
	String authorContact;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthorEmail() {
		return authorEmail;
	}

	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}

	public String getAuthorContact() {
		return authorContact;
	}

	public void setAuthorContact(String authorContact) {
		this.authorContact = authorContact;
	}

}
