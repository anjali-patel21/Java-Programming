package com.company;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int temp,r,s=0,n=121;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number to check for com.company.palindrome:");
//        int n = sc.nextInt();
        temp = n;
        while(n>0){
            r = n%10;  //--1
            n = n/10;  //--12
            s = s*10+r;
        }
        if (temp == s){
            System.out.println("its a com.company.palindrome");

        }
        else {
            System.out.println("its not a com.company.palindrome");

        }
    }
}
