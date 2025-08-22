package org.example;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Enter the number:" + num);
        //Right angle Triangle
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
