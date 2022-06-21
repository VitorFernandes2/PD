package com.isec.webcrawler.network.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetChaptersResponse {

    private List<Chapter> docs;

    public List<Chapter> getDocs() {
        return docs;
    }

    public void setDocs(List<Chapter> docs) {
        this.docs = docs;
    }

    @Override
    public String toString() {
        return "GetChaptersResponse {" +
                "docs=" + docs +
                "}";
    }
}
