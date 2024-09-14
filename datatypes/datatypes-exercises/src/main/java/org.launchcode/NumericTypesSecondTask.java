package org.launchcode;

import java.util.Scanner;

public class NumericTypesSecondTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter number of miles driven: ");
        double miles = input.nextDouble();
        System.out.println("Please, enter the amount of gas gallons consumed: ");
        double gallons = input.nextDouble();
        System.out.println("Miles-per-gallon is: ".concat(String.valueOf(miles / gallons)));
    }
}
