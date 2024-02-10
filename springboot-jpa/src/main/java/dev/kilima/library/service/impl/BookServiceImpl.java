package dev.kilima.library.service.impl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public void updateBook(Book book) {
		dao.save(book);
	}

	@Override
	public void deleteBook(int bookId) {
		dao.deleteById(bookId);
	}

	@Override
	public List<Book> findAllBooks() {
		return dao.findAll();
	}

	@Override
	public Optional<Book> findById(int bookId) {
		// TODO Auto-generated method stub
		return dao.findById(bookId);
	}

	@Override
	public List<Book> findByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.findByTitle(title);
	}

	@Override
	public Optional<Book> getTitleAuthorById(int id) {
		// TODO Auto-generated method stub
		return dao.getTitleAuthorById(id);
	}

}
