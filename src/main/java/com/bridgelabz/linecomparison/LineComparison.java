package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        System.out.println("Enter values for first line:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the value of y1: ");
        double y1 = sc.nextDouble();
        System.out.println("Enter the value x2: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter the value of y2: ");
        double y2 = sc.nextDouble();
        Double length1 = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println("Length of first line: " + length1);

        System.out.println("Enter the value  for second line:");
        System.out.println("Enter the value of x3: ");
        double x3 = sc.nextDouble();
        System.out.println("Enter the value of y3: ");
        double y3 = sc.nextDouble();
        System.out.println("Enter the laue of x4: ");
        double x4 = sc.nextDouble();
        System.out.println("Enter the value of y4: ");
        double y4 = sc.nextDouble();
        Double length2 = Math.sqrt((Math.pow((x4 - x3), 2)) + (Math.pow((y4 - y3), 2)));
        System.out.println("Length of second line is: " + length2);

        boolean result = length2.equals(length1);

        if (result == true) {
            System.out.println("Lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }
    }
}
