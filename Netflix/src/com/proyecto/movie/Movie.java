package com.proyecto.movie;

import java.util.ArrayList;
import java.util.Scanner;

import com.proyecto.data.MovieData;

public final class Movie {

	static public ArrayList<MovieData> getListByConsole(Scanner scn) {

		System.out.println("How many movies do you want to register: ");
		int numberMovies = 0;
		numberMovies = scn.nextInt();

		ArrayList<MovieData> movies = new ArrayList<MovieData>();

		for (int i = 1; i <= numberMovies; i++) {

			MovieData newMovie = new MovieData();

			System.out.println("What is the title of the movies:");
			newMovie.setTitle(scn.next());

			System.out.println("What is the genre of the movies: ");
			newMovie.setGender(scn.next());

			System.out.println("Who is the creator of the movies: ");
			newMovie.setCreator(scn.next());

			System.out.println("What is the year of release of the movies: ");
			newMovie.setYear(scn.nextInt());

			System.out.println("What is the duration of the movies: ");
			newMovie.setDuration(scn.nextDouble());

			System.out.println("Have you seen the movies: ");
			newMovie.setViewed(scn.nextBoolean());

			movies.add(newMovie);
		}

		return movies;
	}

	static public void printToConsole(ArrayList<MovieData> movies) {
		movies.forEach(movie -> {
			System.out.println(movie.toString());
		});
	}

	static public void printMostRecent(ArrayList<MovieData> peliculas) {

		int mostRecentIndex = 0;

		for (int i = 0; i < peliculas.size(); i++) {
			if (peliculas.get(i).getYear() <= peliculas.get(mostRecentIndex).getYear()) {
				mostRecentIndex = i;
			}
		}

		System.out.println("most recent movie is: ");
		System.out.println(peliculas.get(mostRecentIndex).toString());
	}
}
