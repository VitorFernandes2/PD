package com.isec.webcrawler.network.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InfographicBook {

    private String name;
    private List<String> chapters;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getChapters() {
        return chapters;
    }

    public void setChapters(List<String> chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "InfographicBook{" +
                "name=" + name +
                ", chapters=" + chapters +
                "}";
    }
}
