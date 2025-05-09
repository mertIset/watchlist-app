package de.htwberlin.webtech.webtech.web;

public class Watchlist {

    private long id;
    private String title;
    private String type;
    private String genre;
    private boolean watched;
    private int rating;

    public Watchlist(long id, String title, String type, String genre, boolean watched, int rating) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.genre = genre;
        this.watched = watched;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
