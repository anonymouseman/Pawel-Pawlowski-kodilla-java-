package com.kodilla.testing.shape;

public class Square implements Shape {
    public Square() {
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public int getField() {
        return 180;
    }
}
