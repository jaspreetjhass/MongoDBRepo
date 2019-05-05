package org.jp.models;

import java.util.List;

public class Category {

	private String categoryName;
	private List<Book> books;

	public Category() {

	}

	public Category(String categoryName, List<Book> books) {
		super();
		this.categoryName = categoryName;
		this.books = books;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + ", books=" + books + "]";
	}
}
