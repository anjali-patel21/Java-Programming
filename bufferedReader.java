package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferreader {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());

        System.out.println("Enter a string: ");
        String st = br.readLine();

        System.out.println(i);
        System.out.println(st);
    }
}
