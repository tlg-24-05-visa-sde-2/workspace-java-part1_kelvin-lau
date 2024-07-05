class Movie {
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    public Movie(String title) {
        this.setTitle(title);
    }

    public Movie(String title, Genre genre) {
        this(title);
        this.setGenre(genre);
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
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

    public Integer getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return this.revenue;
    }

    public void setRevenue(Double revenue) {
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
        String revenueString = (this.getRevenue() == null) ? "%s" : "$%,.2f";
        return String.format("Movie Title: %s - Release Year: %s - Rating: %s" + " - Genre: %s - Revenue: " + revenueString,
                this.getTitle(), this.getReleaseYear(), this.getRating(), this.getGenre(), this.getRevenue());
//        if (this.getRevenue() == null) {
//            return String.format("Movie Title: %s - Release Year: %s - Rating: %s - Genre: %s - Revenue: %f",
//                    this.getTitle(), this.getReleaseYear(), this.getRating(), this.getGenre(), this.getRevenue());
//        }
//
//        return String.format("Movie Title: %s - Release Year: %s - Rating: %s - Genre: %s - Revenue: $%,.2f",
//                this.getTitle(), this.getReleaseYear(), this.getRating(), this.getGenre(), this.getRevenue());
        // return "Movie Title: " + this.getTitle() + ", Movie Release Year: " + this.getReleaseYear() +
        //        ", Rating: " + this.getRating() + ", Genre: " + this.getGenre() + ", Movie Revenue: $" + this.getRevenue();
    }
}