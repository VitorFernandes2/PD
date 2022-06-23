package com.isec.webcrawler.network.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Character {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("height")
    private String height;
    @JsonProperty("race")
    private String race;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("birth")
    private String birth;
    @JsonProperty("spouse")
    private String spouse;
    @JsonProperty("death")
    private String death;
    @JsonProperty("realm")
    private String realm;
    @JsonProperty("hair")
    private String hair;
    @JsonProperty("name")
    private String name;
    @JsonProperty("wikiUrl")
    private String wikiUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWikiUrl() {
        return wikiUrl;
    }

    public void setWikiUrl(String wikiUrl) {
        this.wikiUrl = wikiUrl;
    }

    @Override
    public String toString() {
        return "Character {" +
                "id=" + id +
                ", height=" + height +
                ", race='" + race +
                ", gender='" + gender +
                ", birth='" + birth +
                ", spouse='" + spouse +
                ", death='" + death +
                ", realm='" + realm +
                ", hair='" + hair +
                ", name='" + name +
                ", wikiUrl='" + wikiUrl +
                "}";
    }
}
