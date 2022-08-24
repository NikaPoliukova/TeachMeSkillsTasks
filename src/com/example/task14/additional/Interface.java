package com.example.task14.additional;


@java.lang.FunctionalInterface
public interface Interface<T> {
    T getValue(T value);
    static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
