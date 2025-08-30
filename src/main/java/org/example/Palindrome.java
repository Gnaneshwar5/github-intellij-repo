package org.example;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        String original=input.next();
        String reverse="";
        for(int i=original.length()-1;i>=0;i--){
          reverse=reverse+original.charAt(i);
        }
        if(reverse.equalsIgnoreCase(original)){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("It is not a palindrome");
        }
        /**
         * Input: "racecar"
         * Output: Yes
         */
    }
}
