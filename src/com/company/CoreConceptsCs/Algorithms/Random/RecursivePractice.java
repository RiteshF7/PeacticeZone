package com.company.CoreConceptsCs.Algorithms.Random;

public class RecursivePractice {

    public static void main(String[] args){

        int result =findFactorial(3);
        print(result+"");
    }

    static int findFactorial(int n){

        if(n==0){
            return 1;
        }
        else{
            print(n+"gg");
            return n*findFactorial(n-1);
        }

    }
    static void print(String s){
        System.out.print(s);
    }

}
