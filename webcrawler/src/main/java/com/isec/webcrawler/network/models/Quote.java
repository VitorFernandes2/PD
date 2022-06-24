package com.isec.webcrawler.network.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Quote {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("dialog")
    private String dialog;
    @JsonProperty("movie")
    private String movie;
    @JsonProperty("character")
    private String character;
    @JsonProperty("id")
    private String quoteId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDialog() {
        return dialog;
    }

    public void setDialog(String dialog) {
        this.dialog = dialog;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    @Override
    public String toString() {
        return "Quote {" +
                "id=" + id +
                ", dialog=" + dialog +
                ", movie=" + movie +
                ", character=" + character +
                ", quoteId=" + quoteId +
                "}";
    }
}
