package com.company;

public class add {
    public static void main(String arg[]){
//        int i=1;
//        int j =4;
//        int k;
//        k = i+j;
//        int a = 0b100_00_00; //binary literal
//        System.out.println(a);
//        System.out.println("hello this is another class  add");
//        System.out.println("sum of "+ i+" and "+j+" is " +k ); // in java + in println statement means concatenation
//        System.out.printf("sum of %d and %d is %d", i,j,k); // using print format to avoid using + again and again
        int i = 5; // 0 1 0 1
        int b = 12;// 1 1 0 0
        //AND & --> 0 0 1 0 = 4
        //OR | --> 1 1 0 1 = 13

        boolean a = false;
        a = !a;
        System.out.println(a);
        System.out.println(i&b);
        System.out.println(i|b);
    }
}
