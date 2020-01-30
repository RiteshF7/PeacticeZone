package com.company.CoreConceptsCs.DataStructures;

public class ArrayProblems {

    public static void main(String[] args){
        int arr[] ={1,2,3,4};
        int temp[] =new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            print(i+"s");
            print(arr.length-1+"a");
            temp[(arr.length-1)-i] =arr[i];
        }
       for(int i =0;i<temp.length;i++){

           print(temp[i]+"se");
       }
    }
    static void print(String s){
        System.out.print(s+" ");
    }
}
