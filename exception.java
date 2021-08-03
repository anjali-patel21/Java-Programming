package com.company;

// Exception handling

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exception {
    public static void main(String[] args) {
        int i,j,k=0;
        int arr[] = new int[5];
        i = 4;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a value for j: ");



        try{
            j = Integer.parseInt(br.readLine());
            k = i/j;
            for(int a = 0; a<=5; a++){
                arr[a] = a;
            }
            for(int values: arr){
                System.out.println(values);
            }
        }

        catch (IOException e){                                    // checked exception
            System.out.println("value entered is not integer");

        }
        catch (ArrayIndexOutOfBoundsException ae){               // unchecked exception
            System.out.println("array index out of bound");
        }
        catch(Exception e){                                      // will catch all kinds of exception
            System.out.println("a number cannot be divided by zero");
        }
        System.out.println(k);
    }
}
