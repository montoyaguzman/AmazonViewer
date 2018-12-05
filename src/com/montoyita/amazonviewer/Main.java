package com.montoyita.amazonviewer;

import java.util.ArrayList;

import com.montoyita.amazonviewer.model.Book;
import com.montoyita.amazonviewer.model.Magazine;
import com.montoyita.amazonviewer.model.Movie;
import com.montoyita.amazonviewer.model.Serie;

public class Main {

	public static void main(String args[]) {
		GenerateData gd = new GenerateData();
		ArrayList<Movie> movies = GenerateData.makeMovies();
		ArrayList<Serie> series = GenerateData.makeSeries();
		ArrayList<Magazine> magazines = GenerateData.makeMagazines();
		ArrayList<Book> books = GenerateData.makeBooks();
		Menu menu = new Menu();
		menu.showMenu(movies, series, magazines, books);
	}
	
}
