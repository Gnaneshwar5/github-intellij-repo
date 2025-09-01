package org.example;

import java.util.Scanner;

public class RemoveLeadingZeroes {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the string:");
        String str= input.nextLine();
        StringBuffer sb=new StringBuffer(str);
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        System.out.println(sb.toString());
    }
}
