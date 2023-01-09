package com.proyecto;

import java.util.ArrayList;
import java.util.Scanner;

import com.proyecto.data.MovieData;
import com.proyecto.data.SerieData;
import com.proyecto.movie.Movie;

public class Principal {

    static Scanner scn = new Scanner(System.in);
    static ArrayList<MovieData> movies = Movie.getList(scn);
    static ArrayList<SerieData> series = recordSeries(scn);

    public static void main(String[] args) {
	Movie.printToConsole(movies);
	Movie.printMostRecent(movies);
	printSeries(series);
	printMostSeasonsSerie(series);
    }

    private static ArrayList<SerieData> recordSeries(Scanner scn) {
	ArrayList<SerieData> series = new ArrayList<SerieData>();

	System.out.println("How many Series you want to register: ");
	int numberseries = 0;
	numberseries = scn.nextInt();

	for (int i = 1; i <= numberseries; i++) {
	    String title;
	    System.out.println("What is the title of the series:");
	    title = scn.next();
	    String creator;
	    System.out.println("Who is the creator of the Series: ");
	    creator = scn.next();
	    String gender;
	    System.out.println("What is the genre of the series: ");
	    gender = scn.next();
	    Integer numberSeasons;
	    System.out.println("What is the number of seasons of the Series: ");
	    numberSeasons = scn.nextInt();
	    double duration;
	    System.out.println("What is the duration of the Series: ");
	    duration = scn.nextDouble();
	    boolean seen;
	    System.out.println("Have you seen the Serie: ");
	    seen = scn.nextBoolean();

	    SerieData newSerie = new SerieData(title, numberSeasons, gender, creator, duration, seen);
	    series.add(newSerie);
	}

	return series;
    }

    static public void printSeries(ArrayList<SerieData> series) {
	series.forEach(serie -> {
	    System.out.println(serie.toString());
	});
    }

    private static void printMostSeasonsSerie(ArrayList<SerieData> series) {

	int mostRecentIndex = 0;

	for (int i = 0; i < series.size(); i++) {
	    if (series.get(i).getNumberSeasons() <= series.get(mostRecentIndex).getNumberSeasons()) {
		mostRecentIndex = i;
	    }
	}

	System.out.println("The series with the most seasons is: ");
	System.out.println(series.get(mostRecentIndex).toString());
    }
}
