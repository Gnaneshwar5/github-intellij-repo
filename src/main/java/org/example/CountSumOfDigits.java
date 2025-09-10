package org.example;

import java.util.Scanner;

public class CountSumOfDigits {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = input.nextInt();
    int sum=0;
    while(num>0){
        sum=sum+num%10;
        num=num/10;
    }
    System.out.println("The count of sum of digits:"+sum);
}
}
