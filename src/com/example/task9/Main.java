package com.example.task9;

public class Main {
    public static void main(String[] args) {
        VectorThreeDimensional vectorThreeDimensional = new VectorThreeDimensional(2, 8, 7);
        VectorThreeDimensional vectorThreeDimensional2 = new VectorThreeDimensional(4, 8, 3);
        System.out.println("Длина вектора = " + vectorThreeDimensional.vectorLength());
        System.out.println();
        System.out.println("Вычисление скалярного произведения = "
                + vectorThreeDimensional.calculateScalarProduct(vectorThreeDimensional2));
        System.out.println();
        System.out.println("Сложение векторов = " + vectorThreeDimensional.calculateVectorSum(vectorThreeDimensional2));
        System.out.println();
        System.out.println("Вывод иноформации о векторе №1");
        System.out.println(vectorThreeDimensional.printInformationAboutVector(vectorThreeDimensional));
        System.out.println("Возвращает массив случайных векторов размером N");
        VectorThreeDimensional.generateThreeDimensional(2);
        System.out.println("...о векторе №2");
        System.out.println(vectorThreeDimensional.printInformationAboutVector(vectorThreeDimensional2));
        System.out.println();
        System.out.println("Сравнение длины векторов ");
        System.out.println(vectorThreeDimensional.compareVector(vectorThreeDimensional, vectorThreeDimensional2));


        System.out.println("Двумерный массив: ");
        VectorTwoDimensional vectorTwoDimensional = new VectorTwoDimensional(2, 8);
        VectorTwoDimensional vectorTwoDimensional2 = new VectorTwoDimensional(5, 9);
        System.out.println("Длина вектора = " + vectorTwoDimensional.vectorLength());
        System.out.println();
        System.out.println("Вычисление скалярного произведения = "
                + vectorTwoDimensional.calculateScalarProduct(vectorTwoDimensional2));
        System.out.println();
        System.out.println("Сложение векторов" + "\n" + vectorTwoDimensional.calculateVectorSum(vectorTwoDimensional2));
        System.out.println();
        System.out.println("Возвращает массив случайных векторов размером N");
        VectorTwoDimensional.generateTwoDimensional(1);
        System.out.println("Вывод иноформации о векторе №1");
        System.out.println(vectorTwoDimensional.printInformationAboutVector(vectorTwoDimensional2));
        System.out.println("...о векторе №2");
        System.out.println(vectorTwoDimensional.printInformationAboutVector(vectorTwoDimensional2));
        System.out.println();
        System.out.println("Сравнение длины векторов ");
        System.out.println(vectorTwoDimensional.compareVector(vectorTwoDimensional, vectorTwoDimensional2));
    }
}
