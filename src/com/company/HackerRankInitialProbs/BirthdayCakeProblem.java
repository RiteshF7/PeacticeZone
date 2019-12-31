package com.company.HackerRankInitialProbs;

import java.util.Arrays;

public class BirthdayCakeProblem {
    public static void main(String[] args){
        int n=4;
        int arr[]={3,2,1,4,4,4,4};
        int maxHeight= Arrays.stream(arr).max().getAsInt();
        int noOfCandles=0;
       for(int i=0;i<arr.length;i++){
           if(maxHeight==arr[i]){
               noOfCandles++;
           }
       }

       System.out.println(noOfCandles);

    }

}
