class MovieClient {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Interstellar", 2014, 681_000_000.82);

        System.out.println(movie1);

        System.out.println();

        Movie movie2 = new Movie("Casablanca", 1942, 4_627_000.0);

        System.out.println(movie2);

        Movie movie3 = new Movie("Coming to America");

        System.out.println(movie3);
    }
}