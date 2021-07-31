package com.company;

public class splitting {
    public static void main(String[] args) {
        String str = " Earth, Mars, Jupiter, Neptune, Saturn";

        String planets[] = str.split(",");

        System.out.println(planets[1]);

        for(String vals : planets) {
            System.out.println(vals);
        }
    }
}

