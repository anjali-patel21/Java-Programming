package com.company;

public class abstractclass {
    public static void main(String[] args) {
        Iphone obj1 = new Iphone();
        Samsung obj2 = new Samsung();
        show(obj2);
    }
    public static void show(Phone obj){
      obj.call();
      obj.playSong();
    }
}
abstract class Phone{
    public abstract void call();
    public abstract void playSong();
}
class Iphone extends Phone{
    public void call(){
        System.out.println("Calling...");
    }
    public void playSong(){
        System.out.println("Playing songs...");
    }
}
class Samsung extends Phone{
    public void call(){
        System.out.println("Samsung calling...");
    }
    public void playSong(){
        System.out.println("Samsung playing songs...");
    }
}
