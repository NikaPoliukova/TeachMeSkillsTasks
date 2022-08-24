package com.example.task14.additional;

public class ServiceForFunctionalInterface {

    public Interface method(String number) {
        if (number.equals("1")) {
            Interface inter = value -> {
                StringBuilder stringBuilder = new StringBuilder((String) value);
                return stringBuilder.reverse();
            };
            return inter;

        } else if (number.equals("2")) {
            Interface<Integer> inter = value -> {
                return Interface.getFactorial(value);
            };
            return inter;

        } else {
            throw new RuntimeException("Incorrect input value");
        }
    }
}


