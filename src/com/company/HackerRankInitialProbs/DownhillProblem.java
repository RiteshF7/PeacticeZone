package com.company.HackerRankInitialProbs;

import java.util.HashMap;
import java.util.Map;

public class DownhillProblem {

    public static void main(String[] args){
        int n =8;
        String[] input = {"D","U","D","D","U","U","U","U","D","D","D"};
        countingValleys(n,input);
    }

    // Complete the countingValleys function below.
    static int countingValleys(int n, String[] strlist) {
        int sealevel =0;
        int count=0;
        Map<String,Integer> data =new HashMap<>();
        for(String s :strlist){
            if(s.equals("D")){
                sealevel--;
            }
            else{
                sealevel++;
                if(sealevel==0){
                    count++;
                }
            }
        }

        System.out.println(count);
        return count;

    }
}
