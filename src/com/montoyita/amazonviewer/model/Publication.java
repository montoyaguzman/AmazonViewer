package com.montoyita.amazonviewer.model;

import java.util.Date;

public class Publication {
	
	private String title;
	private Date date;
	private String editorial;
	private boolean readed;
	private int timeReaded;
	
	public Publication(String title, Date date, String editorial, boolean readed, int timeReaded) {
		super();
		this.title = title;
		this.date = date;
		this.editorial = editorial;
		this.readed = readed;
		this.timeReaded = timeReaded;
	}
	
	public Publication() {
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public boolean isReaded() {
		return readed;
	}

	public void setReaded(boolean readed) {
		this.readed = readed;
	}

	public int getTimeReaded() {
		return timeReaded;
	}

	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}

	@Override
	public String toString() {
		return "Publication [title=" + title + ", date=" + date + ", editorial=" + editorial + ", readed=" + readed
				+ ", timeReaded=" + timeReaded + "]";
	}
	
}
