package com.company.HackerRankInitialProbs;

public class HandshakeProb {
    public static void main(String[] args){
        int n=4;
        int output = (n-2)*n;
        if(n==1)
            output=0;

        System.out.print(output+"");
    }
}
