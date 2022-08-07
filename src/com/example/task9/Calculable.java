package com.example.task9;

public interface Calculable {
    double vectorLength();

    double calculateScalarProduct(Vector vector2);

    Vector calculateVectorSum(Vector vector2);

    Vector vectorDifference(Vector vector2);

    String printInformationAboutVector(Vector vector);

    default Vector compareVector(Vector vector, Vector vector2) {
        if (vector.vectorLength() > vector2.vectorLength()) {
            System.out.println("����� ������� ������� ������");
            return vector;
        } else
            System.out.println("����� ������� ������� ������");
        return vector2;
    }
}


