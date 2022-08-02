package com.example.task6.entity;

public class CreditCard {
    private int accountNumber;
    private double currentSum;

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCurrentSum(double currentSum) {
        this.currentSum = currentSum;
    }

    public double getCurrentSum() {
        return currentSum;
    }

    public CreditCard(int accountNumber, double currentSum) {
        this.accountNumber = accountNumber;
        this.currentSum = currentSum;
    }
}
