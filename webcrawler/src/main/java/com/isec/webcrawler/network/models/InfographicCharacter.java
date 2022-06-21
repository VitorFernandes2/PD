package com.isec.webcrawler.network.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InfographicCharacter {

    private String name;
    private String birth;
    private String height;
    private String race;
    private String gender;
    private String spouse;
    private String death;
    private String realm;
    private String hair;
    private String wikiUrl;
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

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public String getDeath() {
        return death;
    }

    public void setDeath(String death) {
        this.death = death;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getWikiUrl() {
        return wikiUrl;
    }

    public void setWikiUrl(String wikiUrl) {
        this.wikiUrl = wikiUrl;
    }

    @Override
    public String toString() {
        return "InfographicCharacter{" +
                "name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", height='" + height + '\'' +
                ", race='" + race + '\'' +
                ", gender='" + gender + '\'' +
                ", spouse='" + spouse + '\'' +
                ", death='" + death + '\'' +
                ", realm='" + realm + '\'' +
                ", hair='" + hair + '\'' +
                ", wikiUrl='" + wikiUrl + '\'' +
                ", quotes=" + quotes +
                '}';
    }
}
