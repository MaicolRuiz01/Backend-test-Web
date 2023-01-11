package com.proyecto;

import java.util.ArrayList;
import java.util.Scanner;

import com.proyecto.data.MovieData;
import com.proyecto.data.SerieData;
import com.proyecto.movie.Movie;
import com.proyecto.serie.Serie;

public class Principal {

    static Scanner scn = new Scanner(System.in);
    static ArrayList<MovieData> movies = Movie.getList(scn);
    static ArrayList<SerieData> series = Serie.getList(scn);
    

    public static void main(String[] args) {
	Movie.printList(movies);
	Movie.printMostRecent(movies);
	Serie.printList(series);
	Serie.printMoreSeasons(series);
	
    }

    
}
