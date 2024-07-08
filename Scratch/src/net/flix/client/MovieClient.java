package net.flix.client;

import net.flix.Genre;
import net.flix.Movie;
import net.flix.Rating;

class MovieClient {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Interstellar", 2014, 681_000_000.82, Rating.PG_13, Genre.SCI_FI);

        System.out.println(movie1);
        System.out.println();

        Movie movie2 = new Movie("Casablanca", 1942, 4_627_000.0, Rating.PG_13, Genre.DRAMA);

        System.out.println(movie2);
        System.out.println();

        Movie movie3 = new Movie("Coming to America");

        System.out.println(movie3);
        System.out.println();

        Movie movie4 = new Movie("Spirited Away", Genre.ANIME);

        System.out.println(movie4);
    }
}