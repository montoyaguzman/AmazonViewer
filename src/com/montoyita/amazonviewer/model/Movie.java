package com.montoyita.amazonviewer.model;

import java.util.Date;

import com.montoyita.amazonviewer.dao.IVisualizable;

public class Movie extends Film implements IVisualizable{
	
	private int id;
	private int timeViewed;
	private short year;
	
	public Movie(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);
		setYear(year);
	}
	public int getId() {
		return id;
	}
	public int getTimeViewed() {
		return timeViewed;
	}
	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", timeViewed=" + timeViewed + ", year=" + year + "]";
	}
	
	@Override
	public String toString(boolean a) {
		return "My movie [title=" + getTitle();
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
			setTimeViewed(finishDate.getSeconds() - initDate.getSeconds());
		} else {
			setTimeViewed(0);
		}
		
	}
	
}
