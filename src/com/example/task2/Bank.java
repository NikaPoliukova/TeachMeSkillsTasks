package com.example.task2;

import java.util.Scanner;

public class Bank {
    public static void accountSumDeposit() {
        Scanner in = new Scanner(System.in);
        String exit = in.next();
        while (!(exit.equals("exit"))) {
            System.out.print("Enter deposit amount: ");
            float sum = in.nextFloat();
            System.out.print("enter the term of the deposit in months: ");
            int period = in.nextInt();
            for (int i = 1; i <= period; i++) {
                sum += sum * 0.07;
            }
            System.out.printf("After %d months the amount of the deposit will be %f", period, sum);
        }
    }
}