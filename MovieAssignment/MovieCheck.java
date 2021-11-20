package com.tw.assignment1;

import java.util.ArrayList;

public class MovieCheck {

    static String[] getPg(Movie[] movies) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getRating().equals("PG")) {
                arrayList.add(movie.getTitle());
            }
        }
        String[] movieList = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            movieList[i] = arrayList.get(i);
        }
        return movieList;
    }

    public static void main(String[] args) {
        Movie[] movies = new Movie[5];
        movies[0] = new Movie("Casino Royale", "Eon Productions", "PG-13");
        movies[1] = new Movie("Bahubali", "Eon Productions", "R");
        movies[2] = new Movie("Twilight saga", "ABS Productions", "PG");
        movies[3] = new Movie("Twilight Breaking Dawn - 1", "ABS Productions", "PG");
        movies[4] = new Movie("Twilight Eclipse", "ABS Productions");

        String[] movieList = getPg(movies);
        for (String movieName : movieList) {
            System.out.println(movieName);
        }
    }
}
