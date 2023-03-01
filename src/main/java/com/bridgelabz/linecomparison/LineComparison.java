package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    static String str1, str2;


    public void lengthOne() {
        double x1, x2, y1, y2;
        double length1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for first line:");
        System.out.println("Enter the value of x1: ");
        x1 = sc.nextDouble();
        System.out.println("Enter the value of y1: ");
        y1 = sc.nextDouble();
        System.out.println("Enter the value x2: ");
        x2 = sc.nextDouble();
        System.out.println("Enter the value of y2: ");
        y2 = sc.nextDouble();
        length1 = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println("Length of first line: " + length1);
        str1 = Double.toString(length1);

    }

    public void lengthTwo() {
        double x3, x4, y3, y4;
        double length2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value  for second line:");
        System.out.println("Enter the value of x3: ");
        x3 = sc.nextDouble();
        System.out.println("Enter the value of y3: ");
        y3 = sc.nextDouble();
        System.out.println("Enter the laue of x4: ");
        x4 = sc.nextDouble();
        System.out.println("Enter the value of y4: ");
        y4 = sc.nextDouble();
        length2 = Math.sqrt((Math.pow((x4 - x3), 2)) + (Math.pow((y4 - y3), 2)));
        System.out.println("Length of second line is: " + length2);
        str2 = Double.toString(length2);
    }

    public void equalsMethod() {

        if (str1 == str2) {
            System.out.println("Lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }
    }

    public void compareMethod() {
        double result = str2.compareTo(str1);

        if (result == 0) {
            System.out.println("Lines are equal");
        } else if (result > 0.0) {
            System.out.println("line 2 is greater than line 1 ");
        } else {
            System.out.println("Line 1 is greater than line 2 ");
        }

    }

    public static void main(String[] args) {
        LineComparison lineComparison = new LineComparison();
        System.out.println("Welcome to Line Comparison Computation Program");
        lineComparison.lengthOne();
        lineComparison.lengthTwo();
        lineComparison.equalsMethod();
        lineComparison.compareMethod();

    }
}
