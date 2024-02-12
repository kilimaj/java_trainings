package dev.kilima.library.service;

import java.util.List;
import java.util.Optional;

import dev.kilima.library.entity.Book;
import dev.kilima.library.entity.BookCount;

public interface BookService {

	void addBook(Book book);

	void updateBook(Book book);

	void deleteBook(int bookId);

	List<Book> findAllBooks();

	Optional<Book> findById(int bookId);

	List<Book> findByTitle(String title);

	Optional<Book> getTitleAuthorById(int id);

	List<BookCount> bookCountList(String title);
}
