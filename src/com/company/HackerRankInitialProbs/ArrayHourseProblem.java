package com.company.HackerRankInitialProbs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayHourseProblem {
    public static void main(String[] args){
        int input[][]={ {1,1,1,0,0,0},
                        {0,1,0,0,0,0},
                        {1,1,1,0,0,0},
                        {0,0,2,4,4,0},
                        {0,0,0,2,0,0},
                        {0,0,1,2,4,0}
        };

//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 2 4 4 0
//        0 0 0 2 0 0
//        0 0 1 2 4 0

        

     int output =    findMax(input);

     System.out.println(output);

    }
    static int findMax(int[][] arr){
        int rows = arr[0].length;
        int columns =arr.length;
        int rowHorse =rows-2;
        int colomnHorse = columns-2;
        int[] initialIndex={0,0};
        ArrayList<Integer> max = new ArrayList<>();
        int output =0;
        for(int i=0;i<rowHorse;i++){
            for(int j=0;j<colomnHorse;j++){
                initialIndex[0]=i;
                initialIndex[1]=j;
                        max.add(calculateSum(arr,i,j,i+2,j+2));

            }
        }
        output= Collections.max(max);
       // int max = Arrays.stream(maxArray).max().getAsInt();
        return output;
//        calculateSum(arr,0,2,0,2);


    }
    static int calculateSum(int [][] arr,int rstart,int cstarat,int rend,int cend){
        int sum =0;
        int skip =0;
        int skiprow=0;
        for(int i =cstarat;i<=cend;i++){
                for(int j=rstart;j<=rend;j++){
                    if(skip==1){
                        if(skiprow==1){
                            sum=sum+arr[i][j];
                        }
                        skiprow=skiprow+1;

                    }
                    else {
                        sum = sum+arr[i][j];
                    }
                }
            skip=skip+1;
        }
        return sum;
    }

}
