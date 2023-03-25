package com.book.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.store.entity.Book;
import com.book.store.repository.BookRepository;

@Component
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public void save(Book b) {
		bookRepository.save(b);
	}
	public List<Book>getAllBooks(){
		return bookRepository.findAll();
	}
	public Book getBookById(int id) {
		return  bookRepository.findById(id).get();
		
	}
	public void deleteById(int id){
	
		bookRepository.deleteById(id);
		
	}
}
