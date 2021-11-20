package com.tw.assignment1;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return this.rating;
    }

    Movie(String title, String studio, String rating) {
        setTitle(title);
        setStudio(studio);
        setRating(rating);
    }

    Movie(String title, String studio) {
        setTitle(title);
        setStudio(studio);
        setRating("PG");
    }


}
