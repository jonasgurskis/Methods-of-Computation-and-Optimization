package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of an \"a\" (exact) variable: ");
        double input_a = input.nextLong();
        System.out.println("Enter a number of an \"b\" (exact) variable: ");
        double input_b = input.nextLong();
        System.out.println("Enter a number of an \"x\" (approximate) variable: ");
        double input_x = input.nextLong();
        System.out.println("Enter a number of an \"y\" (approximate) variable: ");
        double input_y = input.nextLong();


        Variables SumAndDiff = new Variables(input_a, input_b, input_x, input_y);

        System.out.println("The absolute error is: " + Functions.getAbsoluteError(SumAndDiff.a, SumAndDiff.x));
        System.out.println("The relative error is: " + Functions.getRelativeError(SumAndDiff.a, SumAndDiff.x));



    }
}
