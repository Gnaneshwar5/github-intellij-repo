package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter String1:");
        String str1 = input.nextLine();
        System.out.println("Enter String2:");
        String str2 = input.nextLine();

        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();

        if(str1.length()!=str2.length()){
            System.out.println("It is not an anagram");
            return;
        }

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("It is an anagram");
        }else{
            System.out.println("It is not an anagram");
        }

    }
}
/**
 * Input: str1 = "Silent"
 *             str2 ="Listen"
 * Output: Strings are Anagram
 */
