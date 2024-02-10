package dev.kilima.library.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
}
