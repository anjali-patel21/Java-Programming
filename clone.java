
package com.company;

public class clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        CopyClass obj = new CopyClass();
        obj.a = 12;
        obj.b = 5;

        CopyClass obj1 = (CopyClass) obj.clone();
        obj1.a = 10;

        System.out.println("obj ---> a = " + obj.a + " b = " + obj.b);
        System.out.println("obj1 ---> a = " + obj1.a + " b = " + obj1.b);

    }
}
class CopyClass implements Cloneable{
    int a;
    int b;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
