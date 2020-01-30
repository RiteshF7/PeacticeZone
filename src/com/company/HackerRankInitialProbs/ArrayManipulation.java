package com.company.HackerRankInitialProbs;

import java.util.ArrayList;
import java.util.List;

public class ArrayManipulation {

    public static void main(String[] main){
        int n = 5;
        int input[][] ={{1,2,100},{2,4,100},{3,4,100}};
        arrayManipulationone(n,input);

    }

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long zeroArray[] = new long[n];
        System.out.println(zeroArray[2]);
        int qsize = queries.length;
        for(int i=0;i<qsize;i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            for(int j=a;j<=b;j++){
                int jin=j-1;
                zeroArray[jin]=zeroArray[jin]+k;
            }
        }

        long largest=zeroArray[0];
        for(int i=0;i<n;i++){
            if(zeroArray[i]>largest){
                largest=zeroArray[i];
            }
        }
        System.out.println(largest);
        return largest;
    }
    static long arrayManipulationone(int n, int[][] queries) {

        long outputArray[] = new long[n + 2];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            outputArray[a] += k;
            outputArray[b+1] -= k;
        }
        for(long l:outputArray){
            System.out.print(l+",");
        }
        long max = getMax(outputArray);
        System.out.println(max);
        return max;
    }

    /**
     * @param inputArray
     * @return
     */
    private static long getMax(long[] inputArray) {
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}
