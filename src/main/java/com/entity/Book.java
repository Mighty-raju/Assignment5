package com.entity;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Book_Code")
	private Long id;
	
	@Column(name="Book_Name")
	private String name;
	
	@Column(name="Author_Name")
	private String author;
	
	@Column(name="Date")
	private Date date;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String author, String name) {
		super();
		this.id = (long) new Random().nextInt(1000);
		this.author = author;
		this.name = name;
		this.date = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", name=" + name + ", date=" + date + "]";
	}
	

}
