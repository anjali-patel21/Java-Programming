package com.company;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int i = 1,j = 1,a=0,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of values you want in com.company.fibonacci series:");
        int n = sc.nextInt();
        //j = 18;
        System.out.print(i+" "+j+" ");
//       while(a<=50){
//
//        a= i+j;
//
//           System.out.print(a+ " ");
//           i=j;
//           j=a;
//        }
        // for printing com.company.first 12 numbers in com.company.fibonacci series
        for(a=1;a<=n-2;a++){
            sum=i+j;
            System.out.print(sum+ " ");
            i=j;
            j=sum;

        }
    }
}
