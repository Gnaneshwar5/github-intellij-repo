package org.example;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str= input.nextLine();
        String original=str.toLowerCase();
        String reverse="";
        for(int i=original.length()-1;i>=0;i--){
            reverse=reverse+original.charAt(i);
        }
        System.out.println("The reverse string is :"+reverse);
    }
}
