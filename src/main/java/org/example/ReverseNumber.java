package org.example;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        int reverse =0;
        int n=num;
        while(n>0) {
            reverse = (reverse * 10) + (n % 10);
            n = n / 10;
        }
        System.out.print(reverse);


        }



    }


/**
 * input=456
 * output=654
 *
 */