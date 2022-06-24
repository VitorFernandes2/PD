package com.isec.webcrawler.network.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetQuotesResponse {

    private List<Quote> docs;

    public List<Quote> getDocs() {
        return docs;
    }

    public void setDocs(List<Quote> docs) {
        this.docs = docs;
    }

    @Override
    public String toString() {
        return "GetQuotesResponse {" +
                "docs=" + docs +
                "}";
    }
}
