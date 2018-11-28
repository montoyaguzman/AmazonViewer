package com.montoyita.amazonviewer.dao;

import java.util.Date;

public interface IVisualizable {
	
	Date startToSee(Date date1);
	void stopToSee(Date initDate, Date finishDate);

}
