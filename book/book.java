package com.book;
import com.publisher.*;

public class book {
	private String title;
	private String author;
	private publisher publisher;
	private double price;
	public book(String title, String author, publisher publisher, double price) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
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
	public publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(publisher publisher) {
		this.publisher = publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	public static book getbook(String title, String author, publisher publisher, double price)
			{
	          return new book(title, author, publisher,  price);
			}
	

}
