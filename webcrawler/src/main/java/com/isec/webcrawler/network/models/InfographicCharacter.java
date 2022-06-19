package com.isec.webcrawler.network.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InfographicCharacter {

    private String name;
    private String birth;
    private List<String> quotes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<String> quotes) {
        this.quotes = quotes;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "InfographicCharacter {" +
                "name=" + name +
                ", birth=" + birth +
                ", quotes=" + quotes +
                "}";
    }
}
