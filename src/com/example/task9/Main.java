package com.example.task9;

public class Main {
    public static void main(String[] args) {
        VectorThreeDimensional vectorThreeDimensional = new VectorThreeDimensional(2, 8, 7);
        VectorThreeDimensional vectorThreeDimensional2 = new VectorThreeDimensional(4, 8, 3);
        System.out.println("����� ������� = " + vectorThreeDimensional.vectorLength());
        System.out.println();
        System.out.println("���������� ���������� ������������ = "
                + vectorThreeDimensional.calculateScalarProduct(vectorThreeDimensional2));
        System.out.println();
        System.out.println("�������� �������� = " + vectorThreeDimensional.calculateVectorSum(vectorThreeDimensional2));
        System.out.println();
        System.out.println("����� ����������� � ������� �1");
        System.out.println(vectorThreeDimensional.printInformationAboutVector(vectorThreeDimensional));
        System.out.println("���������� ������ ��������� �������� �������� N");
        VectorThreeDimensional.generateThreeDimensional(2);
        System.out.println("...� ������� �2");
        System.out.println(vectorThreeDimensional.printInformationAboutVector(vectorThreeDimensional2));
        System.out.println();
        System.out.println("��������� ����� �������� ");
        System.out.println(vectorThreeDimensional.compareVector(vectorThreeDimensional, vectorThreeDimensional2));


        System.out.println("��������� ������: ");
        VectorTwoDimensional vectorTwoDimensional = new VectorTwoDimensional(2, 8);
        VectorTwoDimensional vectorTwoDimensional2 = new VectorTwoDimensional(5, 9);
        System.out.println("����� ������� = " + vectorTwoDimensional.vectorLength());
        System.out.println();
        System.out.println("���������� ���������� ������������ = "
                + vectorTwoDimensional.calculateScalarProduct(vectorTwoDimensional2));
        System.out.println();
        System.out.println("�������� ��������" + "\n" + vectorTwoDimensional.calculateVectorSum(vectorTwoDimensional2));
        System.out.println();
        System.out.println("���������� ������ ��������� �������� �������� N");
        VectorTwoDimensional.generateTwoDimensional(1);
        System.out.println("����� ����������� � ������� �1");
        System.out.println(vectorTwoDimensional.printInformationAboutVector(vectorTwoDimensional2));
        System.out.println("...� ������� �2");
        System.out.println(vectorTwoDimensional.printInformationAboutVector(vectorTwoDimensional2));
        System.out.println();
        System.out.println("��������� ����� �������� ");
        System.out.println(vectorTwoDimensional.compareVector(vectorTwoDimensional, vectorTwoDimensional2));
    }
}
