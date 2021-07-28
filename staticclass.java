package com.company;

public class staticclass {
    static {
        System.out.println("Hello from static");  // static block is executed when the class is loaded into JVM
    }

    public static void main(String[] args) {
        System.out.println("Hello from main");    // even if there is no print statement in main()
                                                  // the static block will execute and give the output
    }
    static {
        System.out.println("second static method"); // this block will be executed before main() method
    }
}
