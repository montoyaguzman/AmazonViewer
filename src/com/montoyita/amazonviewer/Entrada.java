package com.montoyita.amazonviewer;

import java.util.Date;

import com.montoyita.amazonviewer.model.Movie;

public class Entrada {

	public static void main(String args[]) {
		Movie movie = new Movie("Coco", "Animacion", "Lee Unkrich", 120, (short)2017);
		boolean a = true;
		System.out.println(movie.toString());
		System.out.println(movie.toString(a));
		// showMenu();
	}
	
	public static void showMenu() {
		int exit = 0;

		do {
			System.out.println("Bienvenido a AMAZON VIEWER");
			System.out.println("Selecciona la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report with date");
			System.out.println("Press 0 to exit.......");

			int response = 1;

			switch (response) {
			case 0:
				// salir
				break;
			case 1:
				showMovies();
				break;
			case 2:
				showSeries();
				break;
			case 3:
				showBooks();
				break;
			case 4:
				showMagazines();
				break;
			case 5:
				makeReport();
				break;
			case 6:
				Date date = new Date();
				makeReport(new Date());
				break;
			default:
				// salir
				break;

			}

		} while (exit != 0);

	}
	
	public static void showMovies() {
		int exit = 0;
		do {
			System.out.println(":: MOVIES ::");
		} while(exit != 0);
	}
	public static void showSeries() {
		int exit = 1;
		do {
			System.out.println(":: SERIES ::");
		} while(exit != 0);
	}
	public static void showBooks() {
		int exit = 1;
		do {
			System.out.println(":: BOOKS ::");
		} while(exit != 0);
	}
	public static void showMagazines() {
		int exit = 1;
		do {
			System.out.println(":: MAGAZINES ::");
		} while(exit != 0);
	}
	
	public static void makeReport() {}
	
	public static void makeReport(Date date) {}
	
	
}
