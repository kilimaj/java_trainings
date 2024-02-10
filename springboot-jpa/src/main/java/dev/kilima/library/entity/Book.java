package dev.kilima.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;

	@Column(length = 100)
	private String title;

	@Column(length = 40)
	private String author;

	@Column
	private double price;

	@Column(length = 50)
	private String publications;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublications() {
		return publications;
	}

	public void setPublications(String publications) {
		this.publications = publications;
	}
	
	
}
