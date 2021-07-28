package com.company;

public class switchcase {
    public static void main(String[] args) {
        int i = 8;
        String s = "Hii";

        switch (i)
        {
            case 1:
                System.out.println("One");
                break; // we use break to break the condition once it is executed
            case 2:
                System.out.println("Two");
                break;
            case 6:
                System.out.println("Six");
                break;

            case 10:
                System.out.println("Ten");
                break;
            default:      // default case if no case satisfies the condition
                System.out.println("Some number");

        }
        switch (s)
        {
            case "Hi":
                System.out.println("Not matched");
            case "Hii":
                System.out.println("Matched");
        }



    }
}
