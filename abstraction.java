package com.company;

public class abstraction {
    public static void main(String[] args) {
        Machine obj = new Machine2();
        obj.chop();
        obj.jump();
        obj.move();
    }
}
abstract class Machine
{
    public void move(){
        System.out.println("Moving...");
    }
    public abstract void jump();
    public abstract void chop();
}

class Machine2 extends Machine
{
    public void jump(){
        System.out.println("Jumping...");
    }
    public void chop(){
        System.out.println("Chopping...");
    }
}