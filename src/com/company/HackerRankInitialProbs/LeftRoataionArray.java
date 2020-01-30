package com.company.HackerRankInitialProbs;

public class LeftRoataionArray {

    public static void main(String[] args){
        int n=2;
        int [] arr = {1,2,3,4,5};
//        arr =leftRotation(arr);

        for(int i=0;i<n;i++){
            arr=leftRotation(arr);
        }

        for(int i:arr){
            System.out.println(i);
        }

    }
    static int[] leftRotation(int[] arr){

        int temp = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
}
