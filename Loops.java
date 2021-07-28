package com.company;

public class Loops {
    public static void main(String[] args) {
        //int i = 11;
        int i;
        //while loop
//        while (i<10)
//        {
//            System.out.println(i);
//            i++;
//        }

        // do while loop
//        do{
//            System.out.println(i);
//            i++;
//        }while (i<10);

        // for loop
//        for(i=1;i<=10;i++){
//            System.out.println(i);
//        }

        // com.company.patterns
//        for(i=1;i<=4;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(i=1;i<=4;i++){
//            for(int j=1;j<=4;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(i=1;i<=4;i++){
//            for(int j=1;j<=4;j++){
//                if(i==1||i==4||j==1||j==4)
//                System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//
//        }
        for(i=1;i<=4;i++)
        {
            for (int j = i; j <=4; j++)
            {
              System.out.print(j+" ");
            }
            for (int k=1; k<i;k++)
            {
              System.out.print(k+" ");
            }
            System.out.println();
        }
//


       }

    }

