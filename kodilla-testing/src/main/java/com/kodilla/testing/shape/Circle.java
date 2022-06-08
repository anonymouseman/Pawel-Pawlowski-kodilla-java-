package com.kodilla.testing.shape;

public class Circle implements Shape {
    public Circle() {
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public int getField() {
        return 101;
    }
}
