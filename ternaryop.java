package com.company;

public class ternaryop {
    public static void main(String[] args) {
        Object obj1;
        Object obj2;
        if(true)
            obj1= new Integer(6);
        else
            obj1 = new Double(13.0);
        System.out.println(obj1);

        obj2 = true?new Integer(5):new Double(13.0);
        System.out.println(obj2);
    }
}
