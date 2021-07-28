package com.company;

public class threeDarray {
    public static void main(String[] args) {
        int a[][][] = {
                { {2,3,4}, {3,4,5}, {4,7,9} },
                { {1,4,5}, {4,7,8}, {9,0,3} },
                { {1,4,2}, {2,6,8}, {1,8,9} }
        };

        for(int i = 0; i<3;i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<3; k++){
                    System.out.print(a[i][j][k]+ " ");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println("-------------------------------------");

        // Enhanced for loop:

        for(int i[][]: a){
            for(int j[]:i){
                for(int k :j){
                    System.out.print(k+" ");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }


    }
}
