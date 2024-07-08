package net.flix;

enum Genre {
    ANIME("Anime"),
    DRAMA("Drama"),
    HORROR("Horror"),
    ROMANTIC_COMEDY("Romantic Comedy"),
    DOCUMENTARY("Documentary"),
    MYSTERY("Mystery"),
    SCI_FI("Sci-Fi"),
    INTERNATIONAL("International");

    private String display;

    Genre(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return this.display;
    }
}

