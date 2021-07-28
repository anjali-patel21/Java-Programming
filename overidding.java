package com.company;
// method overriding or runtime polymorphism or late binding or dynamic binding
public class overidding {
    public static void main(String[] args) {
        parent ob = new child();
        ob.property();
    }
}
class parent{
    public void property(){
        System.out.println("property of parent");
    }
}
class child extends parent{
    public void property(){
        System.out.println("Property of child");
    }
}
