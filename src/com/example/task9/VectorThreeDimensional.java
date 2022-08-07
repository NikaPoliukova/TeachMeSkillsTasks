package com.example.task9;

public class VectorThreeDimensional extends Vector {
    private static final String INFORMATION_ABOUT_THREE_DIMENSIONAL_VECTOR =
            "Это вектор для трехмерной системы координат";
    private int z;

    public VectorThreeDimensional(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public VectorThreeDimensional(int z) {
        this.z = z;
    }


    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public double vectorLength() {
        return Math.sqrt((getX() * getX()) + (getY() * getY()) + (getZ() * getZ()));
    }

    @Override
    public double calculateScalarProduct(Vector vector2) {
        VectorThreeDimensional vector = (VectorThreeDimensional) vector2;
        return ((this.getX() + vector2.getX()) + (this.getY() + vector2.getY()) + (this.z + vector.getZ()));
    }


    @Override
    public Vector calculateVectorSum(Vector vector2) {
        VectorThreeDimensional vector = (VectorThreeDimensional) vector2;
        return new VectorThreeDimensional(super.getX() + vector.getX(),
                super.getY() + vector.getY(), this.getZ() + vector.getZ());
    }

    @Override
    public Vector vectorDifference(Vector vector2) {
        VectorThreeDimensional vector = (VectorThreeDimensional) vector2;
        return new VectorThreeDimensional(super.getX() - vector.getX(),
                super.getY() - vector.getY(), this.getZ() - vector.getZ());
    }

    @Override
    public String printInformationAboutVector(Vector vector) {
        return INFORMATION_ABOUT_THREE_DIMENSIONAL_VECTOR + "\n" + vector.toString();
    }

    public static VectorThreeDimensional[] generateThreeDimensional(int n) {
        VectorThreeDimensional[] vectors = new VectorThreeDimensional[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new VectorThreeDimensional((int) Math.random() + 2, (int) Math.random() + i,
                    (int) Math.random() + (i + 2));
            System.out.println(vectors[i]);
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "VectorThreeDimensional " + "\n" +
                super.toString() + "\n" +
                "z = " + z;
    }
}
