class Movie {
    private String title;
    private int releaseYear;
    private double revenue;
    private Rating rating;
    private Genre genre;

    public Movie(String title) {
        this.setTitle(title);
    }

    public Movie(String title, Genre genre) {
        this(title);
        this.setGenre(genre);
    }

    public Movie(String title, int releaseYear, double revenue, Rating rating, Genre genre) {
        this(title, genre); //delegate to constructor above me for title
        this.setReleaseYear(releaseYear);
        this.setRevenue(revenue);
        this.setRating(rating);
    }

    // accessor methods

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRevenue() {
        return this.revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        return "Movie Title: " + this.getTitle() + ", Movie Release Year: " + this.getReleaseYear() +
                ", Rating: " + this.getRating() + ", Genre: " + this.getGenre() + ", Movie Revenue: $" + this.getRevenue();
    }
}