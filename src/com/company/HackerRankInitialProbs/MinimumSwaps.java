package com.company.HackerRankInitialProbs;

import static sun.misc.Version.print;

public class MinimumSwaps {


    //using selection sort
    //because it use minimum number of swaps

    public static void main(String[] args) {
        int[] list = {4 ,3 ,1 ,2};
        minimumSwaps(list);
//        sort(list);
    }


    static int minimumSwaps(int[] array) {
        int n = array.length - 1;
        int minSwaps = 0;
        for (int i = 0; i < n; i++) {
            if (i < array[i] - 1) {
                swap(array, i, Math.min(n, array[i] - 1));
                minSwaps++;
                i--;
            }
        }
        return minSwaps;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
