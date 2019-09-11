package com.company;

public class Functions {

    public static double getAbsoluteError(double a, double x) {
        return Math.abs(a - x);
    }

    public static double getRelativeError(double a, double x) {
        return (Math.abs(a - x) / Math.abs(a));
    }

    public static double getAmountError(double a, double b, double x, double y){
        return Math.abs((a + b)-(x + y));
    }

    public static double getDifferenceError(double a, double b, double x, double y){
        return Math.abs((a - b)-(x - y));
    }
}