class Movie {
    private String title;
    private int releaseYear;
    private double revenue;

    public Movie() {

    }

    public Movie(String title) {
        this.setTitle(title);
    }

    public Movie(String title, int releaseYear, double revenue) {
        this(title); //delegate to constructor above me for title
        this.setReleaseYear(releaseYear);
        this.setRevenue(revenue);
    }

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

    public String toString() {
        return "Movie Title: " + this.getTitle() + ", Movie Release Year: " + this.getReleaseYear() + ", Movie Revenue: $" + this.getRevenue();
    }
}