package com.company;

public class twoDarray {
    public static void main(String[] args) {
//        int a[]={6,7,4,8};
//        int b[]= {2,4,7,8};
//        int c[]= {6,9,0,8};

        int p[][]={
                {6,7,4,8},
                {2,4,7,81},
                {6,9,0,8}
        };
        int w[][]={
                {3,5,4,8},
                {2,0,7,81},
                {6,19,0,8}
        };
       // int x[][]=p[][] + w[][];
        // using enhanced for loop:
        for (int i[] : p){
            for(int j : i){
                System.out.print(j+ " ");
            }
            System.out.println(" ");
        }
        System.out.println("--------------------------------");
        for (int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                System.out.print(w[i][j]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println("--------------------------------");
        for (int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                System.out.print(w[i][j]+p[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
