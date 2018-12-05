package com.montoyita.amazonviewer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.montoyita.amazonviewer.model.Book;
import com.montoyita.amazonviewer.model.Magazine;
import com.montoyita.amazonviewer.model.Movie;
import com.montoyita.amazonviewer.model.Serie;

public class Menu {
	
	void showMenu(ArrayList<Movie> movies, ArrayList<Serie> series, ArrayList<Magazine> magazines, ArrayList<Book> books) {
		OpcionesMenu om = new OpcionesMenu();
		Scanner sc =  new Scanner(System.in);
		int response = 7;
		
		do {
			System.out.println(" ==== Welcome AMAZON VIEWER ====");
			System.out.println("Choose a option you prefer");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report with date");
			System.out.println("...or press 7 to exit");
			System.out.println("response: ");

			response = sc.nextInt();
			switch (response) {
				case 1:
					// System.out.println("Holiiiii");
					om.showMovies(movies);
					break;
				case 2:
					om.showSeries(series);
					break;
				case 3:
					om.showBooks(books);
					break;
				case 4:
					om.showMagazines(magazines);
					break;
				case 5:
					om.makeReport();
					break;
				case 6:
					om.makeReport(new Date());
					break;
				/*case 7:
					System.out.println("See you...");
					break;*/
				default:
					// salir
					break;
			}
		} while (response != 7);
		System.out.println("See you...");
	}
}
