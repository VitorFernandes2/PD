package com.isec.webcrawler.network.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Chapter {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("chapterName")
    private String chapterName;
    @JsonProperty("book")
    private String book;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Chapter {" +
                "id=" + id +
                ", chapterName=" + chapterName +
                ", book=" + book +
                "}";
    }
}
