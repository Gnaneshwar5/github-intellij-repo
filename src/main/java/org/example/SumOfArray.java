package org.example;

public class SumOfArray {
    public static void main(String[] args){
        int[] arr= {2,4,6,7,9};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            temp=temp+arr[i];

        }
        System.out.print("Sum:"+temp);

    }


    /**
     * Input: [ 2, 4, 6, 7, 9]
     * Output: 28
     */
}
