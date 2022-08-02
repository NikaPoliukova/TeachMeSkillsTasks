package com.example.task7.exercise1;

public class Rectangle extends Figure {
    private static final String NAME = "Rectangle";
    private double width;
    private double height;

    public Rectangle(double width, double height) throws RuntimeException {
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("Invalid rectangle height or width value entered");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getPerimeter() {
        return (width * 2) + (height * 2);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
