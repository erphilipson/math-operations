package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double operand1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter second number: ");
        double operand2 = Double.parseDouble(scanner.nextLine());

        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double division = operand1 / operand2;
        double multiplication = operand1 * operand2;
        double remainder = operand1 % operand2;

        showResults(sum, difference, division, multiplication, remainder);

    }

    public static void showResults(double sum, double difference, double division, double multiplication, double remainder) {
    System.out.println("The sum is " + sum);
    System.out.println("The difference is " + difference);
    System.out.println("The quotient is " + division);
    System.out.println("The product is " + multiplication);
    System.out.println("The remainder is " + remainder);
    }

}
