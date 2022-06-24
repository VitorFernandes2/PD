package com.isec.webcrawler.network.models;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class InfographicRequest {

    private Date createdAt;
    private int numberBooks;
    private int numberMovies;
    private int numberCharacters;
    private int numberQuotes;
    private List<InfographicBook> books;
    private List<InfographicMovie> movies;
    private Map<String, List<InfographicCharacter>> characters;
    private List<InfographicMostTalkativeCharacters> mostTalkativeCharacters;
    private List<InfographicMostSuccessMovies> mostSuccessMovies;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getNumberBooks() {
        return numberBooks;
    }

    public void setNumberBooks(int numberBooks) {
        this.numberBooks = numberBooks;
    }

    public int getNumberMovies() {
        return numberMovies;
    }

    public void setNumberMovies(int numberMovies) {
        this.numberMovies = numberMovies;
    }

    public int getNumberCharacters() {
        return numberCharacters;
    }

    public void setNumberCharacters(int numberCharacters) {
        this.numberCharacters = numberCharacters;
    }

    public int getNumberQuotes() {
        return numberQuotes;
    }

    public void setNumberQuotes(int numberQuotes) {
        this.numberQuotes = numberQuotes;
    }

    public List<InfographicBook> getBooks() {
        return books;
    }

    public void setBooks(List<InfographicBook> books) {
        this.books = books;
    }

    public List<InfographicMovie> getMovies() {
        return movies;
    }

    public void setMovies(List<InfographicMovie> movies) {
        this.movies = movies;
    }

    public List<InfographicMostTalkativeCharacters> getMostTalkativeCharacters() {
        return mostTalkativeCharacters;
    }

    public void setMostTalkativeCharacters(List<InfographicMostTalkativeCharacters> mostTalkativeCharacters) {
        this.mostTalkativeCharacters = mostTalkativeCharacters;
    }

    public List<InfographicMostSuccessMovies> getMostSuccessMovies() {
        return mostSuccessMovies;
    }

    public void setMostSuccessMovies(List<InfographicMostSuccessMovies> mostSuccessMovies) {
        this.mostSuccessMovies = mostSuccessMovies;
    }

    public Map<String, List<InfographicCharacter>> getCharacters() {
        return characters;
    }

    public void setCharacters(Map<String, List<InfographicCharacter>> characters) {
        this.characters = characters;
    }

    @Override
    public String toString() {
        return "InfographicRequest{" +
                "createdAt=" + createdAt +
                ", numberBooks=" + numberBooks +
                ", numberMovies=" + numberMovies +
                ", numberCharacters=" + numberCharacters +
                ", numberQuotes=" + numberQuotes +
                ", books=" + books +
                ", movies=" + movies +
                ", characters=" + characters +
                ", mostTalkativeCharacters=" + mostTalkativeCharacters +
                ", mostSuccessMovies=" + mostSuccessMovies +
                '}';
    }
}
