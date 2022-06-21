package com.isec.webcrawler.network.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InfographicMostTalkativeCharacters {

    private String name;
    private int quotes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuotes() {
        return quotes;
    }

    public void setQuotes(int quotes) {
        this.quotes = quotes;
    }

    @Override
    public String toString() {
        return "InfographicMostTalkativeCharacters {" +
                "name='" + name +
                ", quotes=" + quotes +
                "}";
    }
}
