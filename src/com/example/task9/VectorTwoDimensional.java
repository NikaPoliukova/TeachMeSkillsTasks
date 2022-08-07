package com.example.task9;

public class VectorTwoDimensional extends Vector {
    private static final String INFORMATION_ABOUT_TWO_DIMENSIONAL_VECTOR = "Это вектор для двумерной системы координат";

    public VectorTwoDimensional(int x, int y) {
        super(x, y);
    }

    @Override
    public double vectorLength() {
        return Math.sqrt((getX() * getX()) + (getY() * getY()));
    }

    @Override
    public double calculateScalarProduct(Vector vector2) {
        return ((this.getX() + vector2.getX()) + (this.getY() + vector2.getY()));
    }

    @Override
    public Vector calculateVectorSum(Vector vector2) {
        return new VectorTwoDimensional(getX() + vector2.getX(),
                super.getY() + vector2.getY());
    }

    @Override
    public Vector vectorDifference(Vector vector2) {
        return new VectorTwoDimensional(super.getX() - vector2.getX(),
                super.getY() - vector2.getY());
    }

    public static VectorTwoDimensional[] generateTwoDimensional(int n) {
        VectorTwoDimensional[] vectors = new VectorTwoDimensional[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new VectorTwoDimensional((int) Math.random() + 2, (int) Math.random() + i);
            System.out.println(vectors[i]);
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "VectorTwoDimensional " + "\n" +
                super.toString();
    }

    @Override
    public String printInformationAboutVector(Vector vector) {
        return INFORMATION_ABOUT_TWO_DIMENSIONAL_VECTOR + "\n" + vector.toString();
    }
}
