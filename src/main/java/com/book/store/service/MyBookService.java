package com.book.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.store.entity.MyBookList;
import com.book.store.repository.MyBookListRepository;



@Service
public class MyBookService {
	@Autowired
	private MyBookListRepository repository;

	public void saveMyBooks(MyBookList books) {
		repository.save(books);
	}
	public List<MyBookList>getAllMyBooks(){
		return repository.findAll();
	}
	public void deleteById(int id) {
		repository.deleteById(id);
	}
}
