package com.montoyita.amazonviewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.montoyita.amazonviewer.model.Book;
import com.montoyita.amazonviewer.model.Magazine;
import com.montoyita.amazonviewer.model.Movie;
import com.montoyita.amazonviewer.model.Serie;
import com.montoyita.makereport.Report;

public class OpcionesMenu {
	int option = 0;
	Scanner sc = new Scanner(System.in);
	
	public void showMovies(ArrayList<Movie> movies) {
		int option = 0;
		Movie movie = new Movie();
		do {
			System.out.println("\n:: MOVIES :: ");
			int i = 1;
			for (Movie mv: movies) {
				System.out.println(i + ". " + mv.getTitle() + " - " + mv.isViewed());
				i++;
			}
			System.out.println("What do you want to see? \n...or press 7 to return to menu");
			System.out.println("response: ");
			option = sc.nextInt();
			if (option > 0 && option < movies.size()) { 
				movie = movies.get(option - 1);
				movie.setViewed(true);
				System.out.println("Has visto: " + movies.get(option - 1).getTitle() + "\n");
			}
		} while(option != 7);
		System.out.println("closing movies...\n\n");
	}
	
	public void showSeries(ArrayList<Serie> series) {
		Serie serie = new Serie();
		do {
			System.out.println("\n:: SERIES ::");
			int i = 1;
			for (Serie sr: series) {
				System.out.println(i + ". " + sr.getTitle() + " - " + sr.isViewed());
				i++;
			}
			System.out.println("What do you want to see? \n...or press 7 to return to menu");
			System.out.println("response: ");
			int option = sc.nextInt();
			if (option > 0 && option < series.size()) { 
				serie = series.get(option - 1);
				serie.setViewed(true);
				System.out.println("Has visto: " + series.get(option - 1).getTitle() + "\n");
			}
		} while(option != 7);
		System.out.println("closing series...\n\n");
	}
	
	public void showBooks(ArrayList<Book> books) {
		Book book = new Book();
		do {
			System.out.println("\n:: BOOKS ::");
			int i = 1;
			for (Book bk: books) {
				System.out.println(i + ". " + bk.getTitle() + " - " + bk.isReaded());
				i++;
			}
			System.out.println("What do you want to read? \n...or press 7 to return to menu");
			System.out.println("response: ");
			option = sc.nextInt();
			if (option > 0 && option < books.size()) { 
				book = books.get(option - 1);
				book.setReaded(true);
				System.out.println("Has leido: " + books.get(option - 1).getTitle() + "\n");
			}
		} while(option != 7);
		System.out.println("closing books...\n\n");
	}
	
	public void showMagazines(ArrayList<Magazine> magazines) {
		Magazine magazine = new Magazine();
		do {
			System.out.println("\n:: MAGAZINES ::");
			int i = 1;
			for (Magazine mg: magazines) {
				System.out.println(i + ". " + mg.getTitle() + " - " + mg.isReaded());
				i++;
			}
			System.out.println("What do you want to read? \n...or press 7 to return to menu");
			System.out.println("response: ");
			int option = sc.nextInt();
			if (option > 0 && option < magazines.size()) { 
				magazine = magazines.get(option - 1);
				magazine.setReaded(true);
				System.out.println("Has leido: " + magazines.get(option - 1).getTitle() + "\n");
			}
		} while(option != 7);
		System.out.println("closing magazines...\n\n");
	}
	
	public void makeReport() {
		Report report = new Report();
		report.setTitle("Titulo del reporte\n\n");
		report.setNameFile("reporte");
		report.setExtension("txt");
		String content = "";
		for(int i=0; i<=5; i++) {
			content += "mensaje : " + i + "\n";
		}
		report.setContent(content);
		report.makeReport();
	}
	
	public void makeReport(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String dateString = df.format(date);
		Report report = new Report();
		report.setTitle("Titulo del reporte\n\n");
		report.setNameFile("reportedateString");
		report.setExtension("txt");
		String content = "";
		for(int i=0; i<=5; i++) {
			content += "mensaje : " + i + "\n";
		}
		report.setContent(content);
		report.makeReport();
	}
}
