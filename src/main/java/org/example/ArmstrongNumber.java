package org.example;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        int length= String.valueOf(num).length();
        int sum=0;
        int original=num;

        while(num>0){
            int digit =num%10;
            sum= (int) (sum+Math.pow(digit,length));
            num=num/10;

        }
        if (sum==original){
            System.out.println("It is an Armstrong Number");
        }
        else {
            System.out.println("It is not an Armstrong Number");
        }
    }
}