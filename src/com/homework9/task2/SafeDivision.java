package com.homework9.task2;

import java.util.Scanner;

public class SafeDivision {
    private int firstNumber;
    private int secondNumber;
    Scanner scanner = new Scanner(System.in);

    public void runApplication() {
        setFirstNumber();
        setSecondNumber();
        division();
    }

    private void division() {
        int result;
        try {
            result = firstNumber / secondNumber;
            System.out.println("Division result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by null, change number");
            setSecondNumber();
            division();
        }
    }

    private void setFirstNumber() {
        System.out.println("Please, enter first number - ");
        firstNumber = scanner.nextInt();
    }

    private void setSecondNumber() {
        System.out.println("Please, enter second number - ");
        secondNumber = scanner.nextInt();
    }
}
