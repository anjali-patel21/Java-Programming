package com.company;

public class cloning {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.a = 4;
        obj.b = 7;

        // shallow copying
        MyClass obj1 = obj; // 1 object but 2 reference
        obj1.a = 12;        // will change the value of obj.a

        // deep copying
        MyClass obj2 = new MyClass();
        obj2.a = obj.a;     // manually copy the values
        obj2.b = obj.b;
       // obj2.a  = 11;
        

        System.out.println("obj ---> a = " + obj.a + " b = " + obj.b);
        System.out.println("obj1 ---> a = " + obj1.a + " b = " + obj1.b);
        System.out.println("obj2 ---> a = " + obj2.a + " b = " + obj2.b);
    }
}
class MyClass{
    int a;
    int b;
}
