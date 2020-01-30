package com.company.CoreConceptsCs.Algorithms.Sorting;

public class MergeSortVone {

    public static void main(String[] args){
    int[] arr = {6,5,8,4,7,3,2,5};

        MergeSortVone mergeSortVone = new MergeSortVone();
        int mid = (0+arr.length-1)/2;
        mergeSortVone.sort(arr,0,arr.length-1);
        printArray(arr);


    }


    void sort(int[] arr,int left,int right){

        if(left<right){
            int mid = (left+right)/2;
            sort(arr,left,mid);
            sort(arr,mid+1,right);
            meger(arr,left,mid,right);

        }

    }
// 1,2,3,4,5
    void meger(int[] arr,int left,int mid,int right){

        int leftsize = mid-left+1;
        int rightsize = right-mid;
        int leftArray[]= new int[leftsize];
        int rightarrray[] = new int[rightsize];

        for(int i=0;i<leftsize;i++){
            leftArray[i]=arr[left+i];
        }
        for(int i=0;i<rightsize;++i){
            rightarrray[i]=arr[mid+1+i];
        }

        int i=0;int j=0;int k =left;
        while (i<leftsize && j< rightsize){

            if(leftArray[i] < rightarrray[j]){
                arr[k]=leftArray[i];
                i++;
            }
            else {
                arr[k]=rightarrray[j];
                j++;
            }

            k++;
        }

        while (i<leftsize){
            arr[k]=leftArray[i];
            i++;
            k++;
        }

        while (j<rightsize){
            arr[k]=rightarrray[j];
            j++;
            k++;
        }
    }



    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void print(String s){
        System.out.print(s);
    }
}
