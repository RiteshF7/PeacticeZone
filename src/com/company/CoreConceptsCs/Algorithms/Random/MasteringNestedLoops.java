package com.company.CoreConceptsCs.Algorithms.Random;

public class MasteringNestedLoops {

    public static void main(String[] args){
        int[] arr = {12,23,25,43,54};
        for(int i=0;i<10;i++){
            print("--i = "+i);
            print("\n");
            for(int j=0;j<i+1;j++){
                print(j);
            }
            print("\n");

        }
    }

    static int[] swap(int[] arr, int x,int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
        return arr;
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
        System.out.print(i+"");
    }
}
