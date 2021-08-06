
package com.company;

import java.util.Scanner;

public class userdefinedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your GRE score: ");

        try{
        int score = sc.nextInt();
        if(score>=260)
            System.out.println("You are eligible");
        else
            throw new MyException("Score cannot be below 260");
        }
        catch (MyException e){
            System.out.println(e);
        }

    }
}

class MyException extends Exception{
    public MyException(String msg){
super(msg);
    }
}
