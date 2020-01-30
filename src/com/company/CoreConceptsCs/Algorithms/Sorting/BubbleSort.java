package com.company.CoreConceptsCs.Algorithms.Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};

        bubbleSort(arr,arr.length);

    }



    static void bubbleSort(int[] arr,int n){
        for(int j=0;j<n-1;j++){
            boolean flag=true;
        for(int i=0;i<n-1-j;i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                flag=false;
            }
            if(flag)break;
        }
        }
        printArr(arr);
    }


    static void printArr(int[] arr){
        for(int i : arr){
            print(i+",");
        }
    }
    static void print(String s){
        System.out.print(s);
    }
    static void print(int i){
        System.out.print(i+",");
    }

}
