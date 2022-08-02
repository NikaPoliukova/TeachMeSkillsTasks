package com.example.task7.exercise1;

public class Triangle extends Figure {
    private static final String NAME = "Triangle";
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) throws RuntimeException {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new RuntimeException("invalid triangle side value entered");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2; // полупериметр триугольника
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)); // формуга Герона
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
