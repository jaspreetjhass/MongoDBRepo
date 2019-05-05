package org.jp.models;

import java.util.List;

public class Book {

	private String bookName;
	private String author;
	private List<Topic> topics;

	public Book() {

	}

	public Book(String bookName, String author, List<Topic> topics) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.topics = topics;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", topics=" + topics + "]";
	}
}
