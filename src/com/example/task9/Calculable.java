package com.example.task9;

public interface Calculable {
    double vectorLength();

    double calculateScalarProduct(Vector vector2);

    Vector calculateVectorSum(Vector vector2);

    Vector vectorDifference(Vector vector2);

    String printInformationAboutVector(Vector vector);

    default Vector compareVector(Vector vector, Vector vector2) {
        if (vector.vectorLength() > vector2.vectorLength()) {
            System.out.println("Длина первого вектора больше");
            return vector;
        } else
            System.out.println("Длина второго вектора больше");
        return vector2;
    }
}


