package com.example.task7.exercise1;


public class Circle extends Figure {
    private static final String NAME = "Circle";
    private double radius;

    public Circle(double radius) throws RuntimeException {
        if (radius <= 0) {
            throw new RuntimeException("Radius entered incorrectly");
        }
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return (2 * radius * Math.PI);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
