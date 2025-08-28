package org.example;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr={1,2,2,3,3,3,4,5};
        Set<Integer> uniqueElements= new HashSet<>();
        for(int element :arr){
            uniqueElements.add(element);
        }
        System.out.println(uniqueElements);
        /**
         * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
         * Output: [ 1, 2, 3, 4, 5 ]
         */
    }
}
