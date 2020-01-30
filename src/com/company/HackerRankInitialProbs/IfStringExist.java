package com.company.HackerRankInitialProbs;

import java.util.ArrayList;

public class IfStringExist {

    public static void main(String[] args){
        String[] data = {"aba","baba","aba","xzxb"};
        String [] query ={"aba","xzxb","ab"};
        ArrayList<Integer> output = new ArrayList<>();
        output=getCommonList(data,query);



    }
    static ArrayList<Integer> getCommonList(String[] data, String[] query){
       ArrayList<Integer> output =new ArrayList<>();
       for(int i=0;i<query.length;i++){
           int sum=0;
           for(int j=0;j<data.length;j++){
                if(query[i].equals(data[j])){
                    sum=sum+1;
                }
           }
           output.add(sum);
       }
       return output;
    }
}
