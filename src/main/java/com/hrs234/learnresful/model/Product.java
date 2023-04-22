package com.hrs234.learnresful.model;

import java.math.BigDecimal;

public class Product {
    private final String ID;
    private final String description;
    private final BigDecimal price;

    public Product(final String ID,
                   final String description,
                   final BigDecimal price) {
        this.ID = ID;
        this.description = description;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID='" + ID + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
