package com.company.CoreConceptsCs.Algorithms.Sorting;


public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};

        sortInsertion(arr,arr.length);

    }

    private static void sortInsertion(int[] arr, int length) {

        for(int i=0;i<length-2;i++){
            //i=3
            for(int j=i+1;j>=0;j--){
               print(j);
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            print("\n");
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
