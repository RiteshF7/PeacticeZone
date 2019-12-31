package com.company.HackerRankInitialProbs;

public class EvenOdd {
    public static void main(String[] args){
        int N =22;
        String value ="";
       if(N%2==0){
           if(N>=2){
               value="Not Weird";
           }
           if(N>=6){
               value="Weird";
           }
           if(N>20){
               value="Not Weird";
           }
       }
       else{
            value="Weird";
       }

        System.out.println(value);
    }

}
