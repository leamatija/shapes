package com.shapesproject.model;

import java.util.Arrays;

public enum Shape2D {
    TRIANGLE("TRIANGLE"), SQUARE("SQUARE"), RECTANGLE("RECTANGLE"), RHOMBUS("RHOMBUS"), TRAPEZIUM("TRAPEZIUM");

    private String value;

    Shape2D(String value) {
        this.value = value;
    }

    public Shape2D fromValue(String value) {
        return Arrays.asList(Shape2D.values()).stream()
                .filter(shape2D -> shape2D.getValue().equals(value))
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Value not found"));
    }

    public String getValue() {
        return value;
    }
}