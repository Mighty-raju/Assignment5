package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.BookDao;
import com.entity.Book;

@Controller
public class MainController {

	@Autowired
	private BookDao bookDao;
	
// get all books in home page
	@RequestMapping("/")
	public String home(Model model) {
		 List<Book> books = bookDao.getAllBooks();
		 model.addAttribute("books",books);
		return "index";
	}
	
	@RequestMapping("/add-book")
	public String addBook(Model model) {
		model.addAttribute("title","Add Book");
		return "add_book";
	}
	
//	handle add product form
	@RequestMapping(value="/handle-book", method = RequestMethod.POST) 
	public RedirectView handleBook(@ModelAttribute Book book,HttpServletRequest request) {
		System.out.println(book);
		bookDao.createBook(book);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	
// delete handler for books	
	@RequestMapping("/delete/{id}")
	public RedirectView deleteBook(@PathVariable("id") Long id, HttpServletRequest request) {
		this.bookDao.deleteBook(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;	
	}
	
	@RequestMapping("/update/{id}")
	public String updateBook(@PathVariable("id") Long id , Model model) {
		Book book = this.bookDao.getBook(id);
		model.addAttribute("book", book);
		return "updateBook";
	}
}
