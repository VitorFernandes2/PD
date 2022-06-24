package com.isec.webcrawler.network.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetBooksResponse {

    private List<Book> docs;

    public List<Book> getDocs() {
        return docs;
    }

    public void setDocs(List<Book> docs) {
        this.docs = docs;
    }

    @Override
    public String toString() {
        return "GetBooksResponse{" +
                "docs=" + docs +
                "}";
    }
}
