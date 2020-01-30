package com.company.CoreConceptsCs.Algorithms.Sorting;

public class QuickSort {

    public static void main(String[] args)
    {
        int [] arr= {10, 80, 30, 90, 40, 50, 70};
        QuickSort quickSort = new QuickSort();
//        quickSort.partitionArr(arr,0,arr.length-1);
       arr=  quickSort.quickSort(arr,0,arr.length-1);
        for(int i :  arr){
            System.out.println(
                    i
            );
        }


    }

    int partitionArr(int[] arr,int start,int end){
        int pivot =arr[end];
        int pindex =start-1;
        for(int j =start;j<=end-1;j++){
            if(arr[j]<=pivot){
                pindex++;;
                int temp = arr[pindex];
                arr[pindex]=arr[j];
                arr[j]=temp;

          }
       }
        int temp = arr[pindex+1];
        arr[pindex+1]=arr[end];
        arr[end]=temp;

        return pindex+1;
    }

    int[] quickSort(int [] arr,int start,int end){

        if(start<end){
            int pIndex = partitionArr(arr,start,end);
            quickSort(arr,start,pIndex-1);
            quickSort(arr,pIndex+1,end);

        }
        return arr;
    }

}
