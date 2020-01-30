package com.company.HackerRankInitialProbs;

import java.util.ArrayList;
import java.util.List;

public class DynamicArrayProblem {
//2 5
//        1 0 5
//        1 1 7
//        1 0 3
//        2 1 0
//        2 1 1
    public static void main(String[] args){
        int n=2;
        List<List<Integer>> input = new ArrayList<>();
        List<Integer> i1 = new ArrayList<>();
        i1.add(1);
        i1.add(0);
        i1.add(5);
        List<Integer> i2 = new ArrayList<>();
        i2.add(1);
        i2.add(1);
        i2.add(7);
        List<Integer> i3 = new ArrayList<>();
        i3.add(1);
        i3.add(66202467);
        i3.add(66202467);
        List<Integer> i4 = new ArrayList<>();
        i4.add(2);
        i4.add(1);
        i4.add(0);
        List<Integer> i5 = new ArrayList<>();
        i5.add(2);
        i5.add(1);
        i5.add(1);

        input.add(i1);
        input.add(i2);
        input.add(i3);
        input.add(i4);
        input.add(i5);

       i1= dynamicArray(n,input);
       for(int i : i1){
           System.out.println(i);
       }
    }

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        int lastAnswer =0;
        int seqIndex =-1;
        List<Integer> answer = new ArrayList<>();
        List<List<Integer>> sequences = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> s = new ArrayList<>();
            sequences.add(s);
        }

        for(int i=0;i<queries.size();i++){

            int type = queries.get(i).get(0);
            int x = queries.get(i).get(1);
            int y = queries.get(i).get(2);
            seqIndex = ((x^lastAnswer)%n);
//            System.out.println(seqIndex+" s "+lastAnswer+" l "+x+" x "+y+" y "+type+" t ");

            switch (type){
                case 1:
                    sequences.get(seqIndex).add(y);
                    break;
                case 2:
                        int value = y%sequences.get(seqIndex).size();
                        lastAnswer = sequences.get(seqIndex).get(value);
                        answer.add(lastAnswer);
                    break;
                default:
                    break;
            }
//            System.out.println("s0 "+sequences.get(0)+" s2 "+sequences.get(1));

        }

        return answer;

    }
}
