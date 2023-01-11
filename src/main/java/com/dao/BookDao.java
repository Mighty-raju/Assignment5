package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.entity.Book;

@Component
public class BookDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//to create book
	@Transactional
	public void createBook(Book book) {
		this.hibernateTemplate.saveOrUpdate(book);
	}
	
	//to get single product
	public Book getBook(Long id) {
		return this.hibernateTemplate.get(Book.class, id);
	}
	
	//to get all books 
	public List<Book> getAllBooks() {
		List<Book> books = this.hibernateTemplate.loadAll(Book.class);
		return books;	
	}
	
	//to delete book
	@Transactional
	public void deleteBook(Long id) {
		Book book = this.hibernateTemplate.load(Book.class, id);
		this.hibernateTemplate.delete(book);
	}
}
