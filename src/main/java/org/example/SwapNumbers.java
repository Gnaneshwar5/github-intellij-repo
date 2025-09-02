package org.example;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers to be swapped:");
        int a =input.nextInt();
        int b =input.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("The swapped numbers are:"+a +" "+b);

    }
}
