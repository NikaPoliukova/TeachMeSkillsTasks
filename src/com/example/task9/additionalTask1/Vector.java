package com.example.task9.additionalTask1;


public class Vector {
    private int x, y, z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private double values[];

    public Vector(double[] values) {
        this.values = values;
    }

    public double length() {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i] * values[i];
        }
        return Math.sqrt(sum);
    }

    public double calculateScalarProduct(Vector vector) {
        double res = 0;

        for (int i = 0; i < values.length; i++) {
            res += values[i] * vector.values[i];
        }
        return res;
    }

    public Vector calculateVectorSum(Vector vector) {
        double[] another = new double[values.length];

        for (int i = 0; i < values.length; i++) {
            another[i] = values[i] + vector.values[i];
        }
        return new Vector(another);
    }

    public Vector vectorDifference(Vector vector) {
        double[] another = new double[values.length];

        for (int i = 0; i < values.length; i++) {
            another[i] = values[i] - vector.values[i];
        }
        return new Vector(another);
    }

    private static double[] generateRandomArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static Vector[] generate(int n, int dimension) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(generateRandomArray(dimension));
        }
        return vectors;
    }

    public String printInformationAboutVector(Vector[] vectors) {
        for (Vector vector : vectors) {
            System.out.println(vector.toString());
        }
        return null;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector " + "\n" +
                "x=" + x + "\n" +
                ", y=" + y + "\n" +
                ", z=" + z + "\n" +
                '}';
    }
}
