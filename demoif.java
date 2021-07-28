package com.company;

public class demoif {
    public static void main(String[] args) {
        int a,b,c,x,y;
        a=100;
        b=23;
        c=150;
        x= 11;

        y = x==1?2:13;
        System.out.println(y);

        if(a>b && a>c)
            System.out.println("A is greater");
        else if(b>c)
            System.out.println("B is greater");
        else
            System.out.println("C is greater");
    }
}
