package com.company;

public class varags {
    // varargs = variable arguments
    public static void main(String[] args) {

        Display d = new Display();
        d.show(1,2,3,4);
        System.out.println(" ");
        d.show(1);

    }
}
class Display{
    public void show(int ... a){
        for(int i : a)
        System.out.print(i + " ");
    }
    public void show(int a ){

        System.out.println(a + " in second show method ");
    }
}
