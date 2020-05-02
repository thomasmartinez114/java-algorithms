// Most HackerRank challenges require you to read input from stdin (standard input) and write output to stdout (standard output).

//                          Input Types
// In the example above, we used the nextLine() method, which is used to read Strings. To read other types, look at the table below:

// Method	Description
// nextBoolean()	Reads a boolean value from the user
// nextByte()	Reads a byte value from the user
// nextDouble()	Reads a double value from the user
// nextFloat()	Reads a float value from the user
// nextInt()	Reads a int value from the user
// nextLine()	Reads a String value from the user
// nextLong()	Reads a long value from the user
// nextShort()	Reads a short value from the user

// One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in. For example:
// Scanner scanner = new Scanner(System.in);
// String myString = scanner.next();
// int myInt = scanner.nextInt();
// scanner.close();

// System.out.println("myString is: " + myString);
// System.out.println("myInt is: " + myInt);

// The code above creates a Scanner object named scanner and uses it to read a String and an int. It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String). So, if our input is:
// Hi 5

// Our code will print:
// myString is: Hi
// myInt is 5

//                          CHALLENGE

// read 3 ints using stdin
// print them out using stdout
// each must be on new line

import java.util.*;

import sun.tools.java.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


    }
}