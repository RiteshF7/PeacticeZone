package com.company.CoreConceptsCs.Algorithms;

public class FrontAndBackSearchAlgo {
    public static void main(String [] args){
        int[] arr={2,5,3,7,6,5,3,0};

        print(search(arr,arr.length,3));

    }
    static boolean search(int arr[], int n, int x)
    {

        // Start searching from both ends
        int front = 0, back = n - 1;

        // Keep searching while two indexes
        // do not cross.
        while (front <= back)
        {
            if (arr[front] == x || arr[back] == x){

                System.out.println("o"+arr[front]+" "+arr[back]);
                return true;
            }

            front++;
            back--;
        }

        return false;
    }

    static void print(boolean s){
        System.out.println(s+"");
    }
    static void print(int s){
        System.out.println(s+"");
    }
}
