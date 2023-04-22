package com.hrs234.learnresful.model;

public class ProductResponse {
    private final String ID;

    public ProductResponse(final String id) {
        this.ID = id;
    }

    public String getID() {
        return this.ID;
    }
}
