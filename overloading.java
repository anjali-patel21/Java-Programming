package com.company;
// method overloading
public class overloading {
    public static void main(String[] args) {
        A ob = new A();
        ob.methodOne(12.6);
    }
}

class A{
    public void methodOne()
    {
        System.out.println("method without parameter");
    }
    public void methodOne(int i)
    {
        System.out.println("Method with int parameter "+ i);
    }
    public void methodOne(double j)
    {
        System.out.println("Method with double parameter "+ j);
    }
}
