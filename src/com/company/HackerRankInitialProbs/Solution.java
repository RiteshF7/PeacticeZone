package com.company.HackerRankInitialProbs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main (String [] args){
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        one.add(1);
        one.add(2);
        one.add(3);
        two.add(4);
        two.add(5);
        two.add(6);
        three.add(7);
        three.add(8);
        three.add(-20);



        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(one);arr.add(two);arr.add(three);


        int size = -100;
        int pos =0;
        int ltr = 0;
        int rtl =0;
        for (int i =0;i<arr.size();i++){
            ltr=ltr+arr.get(i).get(pos);
            System.out.println(arr.get(i).get(pos));
            pos=pos+1;
        }
        pos=0;
        for (int i =arr.size()-1;i>=0;i--){
            rtl=rtl+arr.get(i).get(pos);
            System.out.println(arr.get(i).get(pos));
            pos=pos+1;
        }
        System.out.println(Math.abs(ltr-rtl)+"");
    }

}



