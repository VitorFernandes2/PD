package com.isec.webcrawler.network.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCharactersResponse {

    private List<Character> docs;

    public List<Character> getDocs() {
        return docs;
    }

    public void setDocs(List<Character> docs) {
        this.docs = docs;
    }

    @Override
    public String toString() {
        return "GetCharactersResponse {" +
                "docs=" + docs +
                "}";
    }
}
