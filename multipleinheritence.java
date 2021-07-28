package com.company;

public class multipleinheritence {
    public static void main(String[] args) {
        Abc obj = new Xyz();
        obj.show();
    }
}
interface Abc{
    void show();
}
class Xyz implements Abc{
    @Override
    public void show() {
        System.out.println(" inside Xyz show..");
    }

}
