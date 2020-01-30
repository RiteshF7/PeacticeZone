package com.company.CoreConceptsCs.Algorithms.Sorting;

public class Opps {

    void arrayget(int [] arr,int [] arr2){

        arr[0]=11;
        arr[1]=12;

        arr2[0]=01;arr2[1]=02;

    }

    public static void main(String[] args){
        int [] arr = {1,2,3,4};
        int [] arr1 = {10,20,30,40};
        System.out.println("old array");
        printarr(arr);
        Opps opps = new Opps();
        opps.arrayget(arr,arr1);
        System.out.print("new Arr");
        printarr(arr);
        printarr(arr1);
        if(0<0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }

    public static void printarr(int[] arr){
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
