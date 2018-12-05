package com.montoyita.amazonviewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.montoyita.amazonviewer.model.Book;
import com.montoyita.amazonviewer.model.Magazine;
import com.montoyita.amazonviewer.model.Movie;
import com.montoyita.amazonviewer.model.Serie;

public class GenerateData {
	
	static Date date = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public static ArrayList<Movie> makeMovies() {
		ArrayList<Movie> movies = new ArrayList();
		movies.add(new Movie("Coco", "Animacion", "Lee Unkrich", 105, (short)2017));
		movies.add(new Movie("Animales Fantasticos", "Fantasia", "J.K. Rowling", 133, (short)2016));
		movies.add(new Movie("Avengers", "Superheros", "Kevin Feige", 143, (short)2012));
		return movies;
	}
	
	public static ArrayList<Serie> makeSeries() {
		ArrayList<Serie> series = new ArrayList();
		series.add(new Serie("Arrow", "Superheros", "CW", 43, 7));
		series.add(new Serie("Flash", "Superheros", "CW", 42, 5));
		series.add(new Serie("Legends", "Superheros", "CW", 40, 4));
		return series;
	}
	
	public static ArrayList<Magazine> makeMagazines() {
		ArrayList<Magazine> magazines = new ArrayList();
		magazines.add(new Magazine("ESPN", date, "espn", false, 0, "Alison Overholt"));
		magazines.add(new Magazine("Soccermania", date, "sc", false, 0, "Escritor 2"));
		magazines.add(new Magazine("Futbol Total", date, "ft", false, 0, "Escritor 3"));
		return magazines;
	}
	
	public static ArrayList<Book> makeBooks() {
		String authors[] = new String[2];
		authors[0] = "author 1";
		authors[1] = "author 2";
		ArrayList<Book> books = new ArrayList();
		books.add(new Book("Harry Potter y la Piedra Filosofal", date, "Salamandra", false, 0, "1", authors));
		books.add(new Book("Calculo Diferencial", date, "Mc Graw Hill", false, 0, "1", authors));
		books.add(new Book("World English", date, "Editorial 3", false, 0, "1", authors));
		return books;
	}
	
}
