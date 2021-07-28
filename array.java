package com.company;

import java.util.Random;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int a[] = new int[10];
        Random r = new Random(); //using Random class of java to generate random values for the com.company.array

        System.out.println(a);
        //will print the hash code, whenever we try to print any object it will print its hash code

        for(int i = 0; i<a.length; i++){
            a[i]= r.nextInt(6);
        }


        for(int i =0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println("\n--------------------------- ");
        // ENHANCED FOR LOOP
        // it only works for arrays and collections

        for(int i:a){
            System.out.print(i+ " ");
        }
//        System.out.print("Enter values of com.company.array:");
//        int i;
//        for(i=0;i<5;i++){
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            a[i] = n;
//            System.out.print(a[i]);
//        }
    }
}
