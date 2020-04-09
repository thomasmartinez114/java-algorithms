// Objective
// In this challenge, you'll work with arithmetic operators. Check out the
// Tutorial tab for learning materials and an instructional video!

// Task
// Given the meal price (base cost of a meal), tip percent (the percentage of
// the meal price being added as tip), and tax percent (the percentage of the
// meal price being added as tax) for a meal, find and print the meal's total
// cost.

// Note: Be sure to use precise values for your calculations, or you may end up
// with an incorrectly rounded result!

// Input Format

// There are lines of numeric input:
// The first line has a double, (the cost of the meal before tax and tip).
// The second line has an integer, (the percentage of being added as tip).
// The third line has an integer, (the percentage of being added as tax).

// Output Format

// Print the total meal cost, where is the rounded integer result of the entire
// bill ( with added tax and tip).

// Sample Input

// 12.00
// 20
// 8
// Sample Output

// 15
// Explanation

// Given:
// , ,

// Calculations:

// We round to the nearest dollar (integer) and then print our result, .

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // System.out.println(meal_cost);
        // System.out.println(tip_percent);
        // System.out.println(tax_percent);

        // // Declare the Scanner
        // Scanner sc = new Scanner(System.in);
        // // Declare primitive types
        // double meal_cost = sc.nextDouble();
        // int tip_percent = sc.nextInt();
        // int tax_percent = sc.nextInt();
        // // End Scanner
        // sc.close();

        // // Calculations
        // double tipTotal = (tip_percent * meal_cost) / 100;
        // System.out.println("Tip is: " + tipTotal);

        // Calculations
        double tip = meal_cost * tip_percent / 100;
        // System.out.println("Tip is: " + tip);
        double tax = meal_cost * tax_percent / 100;
        // System.out.println("Meal Tax is: " + tax);
        // Add to the Meal Cost which is rounded int
        int totalCost = (int) Math.round(meal_cost + tax + tip);
        System.out.println(totalCost);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
