package com.montoyita.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publication {
	
	private int id;
	private String writer;
	
	public Magazine(String title, Date date, String editorial, boolean readed, int timeReaded, String writer) {
		super(title, date, editorial, readed, timeReaded);
		this.writer = writer;
	}

	public int getId() {
		return id;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
		
	
	
}
