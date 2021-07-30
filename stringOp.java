package com.company;
// performing some string operations
import java.util.Scanner;

public class stringOp {
    public static void main(String[] args) {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter both strings:");
        s1 = sc.nextLine();
        s2 = sc.nextLine();

        // finding the length of given strings
        System.out.println("Length of string 1 is: " + s1.length());
        System.out.println("Length of string 2 is: " + s2.length());

        // Concatenating strings
        System.out.println("Concatenated string: " + s1+s2);

        // Converting string into upper case
        System.out.println("Converting string 1 into upper case: " + s1.toUpperCase());
    }
}
