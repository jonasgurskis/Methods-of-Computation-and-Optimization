package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of an \"a\" (exact) variable: ");
        double input_a = input.nextDouble();
        System.out.println("Enter a number of an \"b\" (exact) variable: ");
        double input_b = input.nextDouble();
        System.out.println("Enter a number of an \"x\" (approximate) variable: ");
        double input_x = input.nextDouble();
        System.out.println("Enter a number of an \"y\" (approximate) variable: ");
        double input_y = input.nextDouble();

        Variables value = new Variables(input_a, input_b, input_x, input_y);

        System.out.println("The ABSOLUTE error of \"a\" is: " + Functions.getAbsoluteError(value.a, value.x));
        System.out.println("The ABSOLUTE error of \"b\" is: " + Functions.getAbsoluteError(value.b, value.y));
        System.out.println("The RELATIVE error of \"a\" is: " + Functions.getRelativeError(value.a, value.x));
        System.out.println("The RELATIVE error of \"b\" is: " + Functions.getRelativeError(value.b, value.y));
        System.out.println("The AMOUNT error is: " +
                Functions.getAmountError(value.a, value.b, value.x, value.y));
        System.out.println("The DIFFERENCE error is: " +
                Functions.getDifferenceError(value.a, value.b, value.x, value.y));
    }
}