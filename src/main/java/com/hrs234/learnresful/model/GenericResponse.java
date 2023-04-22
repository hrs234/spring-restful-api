package com.hrs234.learnresful.model;

public class GenericResponse {
    private final String message;
    private final String status;

    public GenericResponse(
            final String status,
            final String message
    ) {
        this.message = message;
        this.status = status;
    }

}
