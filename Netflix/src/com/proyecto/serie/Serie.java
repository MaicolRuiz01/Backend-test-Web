package com.proyecto.serie;

import java.util.ArrayList;
import java.util.Scanner;
import com.proyecto.data.SerieData;

public class Serie {

	public static ArrayList<SerieData> getList(Scanner scn){
		
		System.out.println("How many series do you want to register: ");
		int numberSeries = 0;
		numberSeries = scn.nextInt();
		
		ArrayList<SerieData> series = new ArrayList<SerieData>();
		for (int i = 1; i <= numberSeries; i++) {

			SerieData newMovie = new SerieData();

		    System.out.println("What is the title of the series :");
		    newMovie.setTitle(scn.next());

		    System.out.println("What is the genre of the series : ");
		    newMovie.setGender(scn.next());

		    System.out.println("Who is the creator of the series : ");
		    newMovie.setCreator(scn.next());

		    System.out.println("What is the year of release of the series : ");
		    newMovie.setNumberSeasons(scn.nextInt());

		    System.out.println("How many seasons does the series have:  ");
		    newMovie.setDuration(scn.nextDouble());

		    System.out.println("Have you seen the series : ");
		    newMovie.setViewed(scn.nextBoolean());

		    series.add(newMovie);
		}

		return series;
	    }
	
	static public void printList(ArrayList<SerieData> series) {
		series.forEach(serie -> {
		    System.out.println(series.toString());
		});
	    }
	static public void printMoreSeasons(ArrayList<SerieData> series) {

		int moreSeasonsIndex = 0;

		for (int i = 0; i < series.size(); i++) {
		    if (series.get(i).getNumberSeasons() <= series.get(moreSeasonsIndex).getNumberSeasons()) {
		    	moreSeasonsIndex = i;
		    }
		}

		System.out.println("The series with the most seasons is: ");
		System.out.println(series.get(moreSeasonsIndex).toString());
	    }
		
		
		
	
}
