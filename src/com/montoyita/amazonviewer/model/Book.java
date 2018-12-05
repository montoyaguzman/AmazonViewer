package com.montoyita.amazonviewer.model;

import java.util.Date;

import com.montoyita.amazonviewer.dao.IVisualizable;

public class Book extends Publication implements IVisualizable {
	
	private int id;
	private String isbn;
	private String authors[];
	
	public Book(String title, Date date, String editorial, boolean readed, int timeReaded, String isbn, String authors[]) {
		super(title, date, editorial, readed, timeReaded);
		this.isbn = isbn;
		this.authors = authors;
	}
	
	public Book() {
	}

	public int getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	@Override
	public Date startToSee(Date date1) {
		// TODO Auto-generated method stub
		return date1;
	}

	@Override
	public void stopToSee(Date initDate, Date finishDate) {
		// TODO Auto-generated method stub
		if (finishDate.getSeconds() > initDate.getSeconds()) {
			setTimeReaded(finishDate.getSeconds() - initDate.getSeconds());
		} else {
			setTimeReaded(0);;
		}
	}
	
	
	
	
	
}
