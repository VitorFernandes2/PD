package com.isec.webcrawler.network.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMoviesResponse {

    private List<Movie> docs;

    public List<Movie> getDocs() {
        return docs;
    }

    public void setDocs(List<Movie> docs) {
        this.docs = docs;
    }

    @Override
    public String toString() {
        return "GetMoviesResponse {" +
                "docs=" + docs +
                "}";
    }
}
