package com.company.CoreConceptsCs.Algorithms.Sorting;

public class SelectionSort {

       public static void main(String[] args){

           int[] arr={5,4,3,2,1};
           selectionSort(arr);

       }

    private static void selectionSort(int[] arr) {
           findMin(arr,0,arr.length);
           for(int i=0;i<arr.length;i++){
//               int min =findMin(arr,i,arr.length);
//               if(arr[i]>min){
//
//               }
           }
    }

    public static int findMin(int[] arr,int start,int end){
           int min=-1;
           for(int val=start;val<end;val++){
               if(min>arr[val])
                   min =val;
           }
           System.out.println(arr[min]);
           return min;
    }
}
