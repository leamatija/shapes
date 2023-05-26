package com.shapesproject.model;

import java.util.Arrays;

public enum Shape3D {
    CUBE("CUBE"),CUBOID("CUBOID"),CYLINDER("CYLINDER");

    private String value;

    Shape3D(String value) {
        this.value = value;
    }

    public Shape3D fromValue(String value) {
        return Arrays.asList(Shape3D.values()).stream()
                .filter(shape3D -> shape3D.getValue().equals(value))
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Value not found"));
    }

    public String getValue() {
        return value;
    }
}

