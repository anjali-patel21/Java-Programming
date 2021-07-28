package com.company;

public class patterns {
    /*
    pattern
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1

    */
    public static void main(String[] args) {
        int i=1;
        for(i=1; i<=5;i++) //rows
        {
            for(int j=1;j<=i;j++) //columns
            {
                if((i+j)%2==0)
                {
                    System.out.print("1 ");

                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("-----------------------------------");
        /*
        Second Pattern
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
         */
        for (i=1;i<=5;i++) //rows
        {
            for (int j=1;j<=i;j++) //columns
            {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }

    }
}
