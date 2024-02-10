package dev.kilima.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.kilima.library.dao.BookDao;
import dev.kilima.library.entity.Book;
import dev.kilima.library.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao dao;

	@Override
	public void addBook(Book book) {
		dao.save(book);
	}

}
