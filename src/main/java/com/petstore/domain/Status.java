package com.petstore.domain;


/**
 * Created by Heba Aboelez on 13/09/2020.
 */

public enum Status {

    available("available"),
    pending("pending"),
    sold("sold");

    private String value;

    Status(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
