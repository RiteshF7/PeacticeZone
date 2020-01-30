package com.company.HackerRankInitialProbs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class YearOfChaos {

    public static void main(String[] args){

        int[] list ={1 ,6,3,2,4,5};
        System.out.println(minimumBribes(list));

    }

    // Complete the minimumBribes function below.
    static int minimumBribes(int[] q) {
        if (!isValid(q)) {
            System.out.println("Too chaotic");
            return -1;
        }

        int swapNum = 0;
        LinkedList<Integer> target = new LinkedList<>(Arrays.stream(q).sorted().boxed().collect(Collectors.toList()));
        for (int number : q) {
            int index = target.indexOf(number);
            if (index >= 3) {
                return -1;
            }

            swapNum += index;
            target.remove(index);
        }
        System.out.println(swapNum);
        return swapNum;
    }

    static boolean isValid(int[] q) {
        return Arrays.stream(q).min().getAsInt() == 1 && Arrays.stream(q).max().getAsInt() == q.length
                && Arrays.stream(q).distinct().count() == q.length;
    }
}
