package com.company;

public class Functions {

    public static double getAbsoluteError(double a, double x) {
        return Math.abs(a - x);
    }

    public static double getRelativeError(double a, double x) {
        return (Math.abs(a - x) / Math.abs(a));
    }
}
