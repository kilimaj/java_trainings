package dev.kilima.library.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.kilima.library.entity.Book;
import dev.kilima.library.service.BookService;

@RestController
@RequestMapping("book")
public class BookController {

	@Autowired
	BookService service;

	@PostMapping
	public ResponseEntity<String> addBook(@RequestBody Book book) {
		service.addBook(book);
		String mesg = "book inserted on " + new Date();
		return new ResponseEntity<String>(mesg, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Book>> findAllBooks() {
		List<Book> list = service.findAllBooks();
		return new ResponseEntity<List<Book>>(list, HttpStatus.OK);
	}

	@GetMapping("/{bookId}")
	public ResponseEntity<Optional<Book>> findBookById(@PathVariable int bookId) {
		Optional<Book> book = service.findById(bookId);
		return new ResponseEntity<Optional<Book>>(book, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<String> update(@RequestBody Book book) {
		service.updateBook(book);
		return new ResponseEntity<String>("book updated", HttpStatus.OK);
	}

	@DeleteMapping("/{bookId}")
	public ResponseEntity<String> delete(@PathVariable int bookId) {
		service.deleteBook(bookId);
		return new ResponseEntity<String>("deleted", HttpStatus.OK);
	}

	@GetMapping("/title/{title}")
	public ResponseEntity<List<Book>> findByTitle(@PathVariable String title) {
		List<Book> books = service.findByTitle(title);
		return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
	}

	@GetMapping("/titleauthor/{id}")
	public ResponseEntity<Optional<Book>> getTitleAuthorById(@PathVariable int id) {
		Optional<Book> book = service.getTitleAuthorById(id);
		return new ResponseEntity<Optional<Book>>(book, HttpStatus.OK);
	}
}
