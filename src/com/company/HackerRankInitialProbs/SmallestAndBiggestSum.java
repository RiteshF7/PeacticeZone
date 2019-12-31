package com.company.HackerRankInitialProbs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class SmallestAndBiggestSum {

    public static void main(String[] args){
        int arr[]={1,3,3,7,9};
        long sum=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            sum =sum+arr[i];
        }
        System.out.println(sum);
        sum=0;
        for(int i=arr.length-1;i>0;i--){
            sum =sum+arr[i];
        }
        System.out.println(sum);
    }
}
