package com.epam.rd.autotasks;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.CANADA);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        NumberFormat nf = NumberFormat.getInstance(Locale.FRENCH);

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        double root1 = (-b + sqrt(discriminant)) / (2 * a);

        if (discriminant > 0) {
            double root2 = (-b - sqrt(discriminant)) / (2 * a);
            System.out.println(root1 + " " + root2);
        }
        else if (discriminant == 0) {

            System.out.println(root1);
        }
        else
            System.out.println("no roots");
    }
}