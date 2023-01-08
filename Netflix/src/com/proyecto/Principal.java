package com.proyecto;

import java.util.ArrayList;
import java.util.Scanner;





public class Principal {
	
	public static void main(String[] args) {
		
		
		ArrayList<Movie> movies =recordMovies();
		ArrayList<Serie> series=recordSeries();
		printListMoviesSeries(movies, series);
		movieMostRecent(movies);
		serieMoreSeansons(series);
		
		
	}
	
	static Scanner scn=new Scanner(System.in);
	
	
	private static ArrayList<Movie> recordMovies() {
		
		ArrayList<Movie> movies = new ArrayList<Movie>();
		
		System.out.println("How many movies do you want to register: ");
		int numberMovies=0;
		numberMovies=scn.nextInt();
		
		for (int i=1; i<=numberMovies;i++) {
			String title;
			System.out.println("What is the title of the movies:");
			title=scn.next();
			String gender;
			System.out.println("What is the genre of the movies: ");
			gender=scn.next();
			String creator;
			System.out.println("Who is the creator of the movies: ");
			creator=scn.next();
			Integer year;
			System.out.println("What is the year of release of the movies: ");
			year=scn.nextInt();
			double duration;
			System.out.println("What is the duration of the movies: ");
			duration=scn.nextDouble();
			boolean seen;
			System.out.println("Have you seen the movies: ");
			seen=scn.nextBoolean();
			
			Movie newMovie =new Movie(title, gender, creator, year, duration, seen);
			movies.add(newMovie);
		}
		return movies;
	}
	
	
		private static ArrayList<Serie> recordSeries() {
		
		ArrayList<Serie> series = new ArrayList<Serie>();
		
		System.out.println("How many Series you want to register: ");
		int numberseries=0;
		numberseries=scn.nextInt();
		
		for (int i=1; i<=numberseries;i++) {
			String title;
			System.out.println("What is the title of the series:");
			title=scn.next();
			String creator;
			System.out.println("Who is the creator of the Series: ");
			creator=scn.next();
			String gender;
			System.out.println("What is the genre of the series: ");
			gender=scn.next();
			Integer numberSeasons;
			System.out.println("What is the number of seasons of the Series: ");
			numberSeasons=scn.nextInt();
			double duration;
			System.out.println("What is the duration of the Series: ");
			duration=scn.nextDouble();
			boolean seen;
			System.out.println("Have you seen the Serie: ");
			seen=scn.nextBoolean();
			
			Serie newSerie =new Serie(title, numberSeasons, gender, creator, duration, seen);
			series.add(newSerie);
		}
		return series;
	}
	
	
	
	private static void printListMoviesSeries(ArrayList<Movie> peliculas, ArrayList<Serie> series) {
		
		for(int i=0;i< peliculas.size();i++) {
			System.out.println(peliculas.toString());
		}
		
		for(int j=0;j<series.size();j++) {
			System.out.println(series.toString());
		}
	}
	
	private static void movieMostRecent(ArrayList<Movie> peliculas) {
		System.out.println("most recent movie is: ");
		int movieWithMoreeasons=0;
		int currentMovieTraveled;
		int indice = 0;
		for(int i=1; i<peliculas.size();i++) {
			currentMovieTraveled=peliculas.get(i).getYear();
			if(i==0) {
				movieWithMoreeasons=currentMovieTraveled;
				currentMovieTraveled=0;
			}
			if(currentMovieTraveled>=movieWithMoreeasons) {
				movieWithMoreeasons=currentMovieTraveled;
				currentMovieTraveled=0;
				indice=i;
			}
		}
		System.out.println(peliculas.get(indice).toString());
	}
	
	private static void serieMoreSeansons(ArrayList<Serie> series) {
		System.out.println("The series with the most seasons is: ");
		int seriesWithMoreeasons=0;
		int currentSeriesTraveled;
		int index = 0;
		for(int i=1; i<series.size();i++) {
			currentSeriesTraveled=series.get(i).getNumberSeasons();
			if(i==0) {
				seriesWithMoreeasons=currentSeriesTraveled;
				currentSeriesTraveled=0;
			}
			if(currentSeriesTraveled>=seriesWithMoreeasons) {
				seriesWithMoreeasons=currentSeriesTraveled;
				currentSeriesTraveled=0;
				index=i;
			}
		}
		System.out.println(series.get(index).toString());
	}	
	}



