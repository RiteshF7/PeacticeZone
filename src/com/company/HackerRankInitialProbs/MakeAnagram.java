package com.company.HackerRankInitialProbs;

import com.company.CoreConceptsCs.DataStructures.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class MakeAnagram {

    public static void main(String[] args){
        int deletedNumber  =0;
        String first ="cde",second ="abc";
        deletedNumber = claculateCharDeleted(first,second);
    }

    public static int claculateCharDeleted(String first,String second){
        int count =0;
        char[] arrayFirst = first.toCharArray();
        char[] arraySecond =second.toCharArray();
        HashMap<Character,Integer> mapFirst = new HashMap<>();
        HashMap<Character,Integer> mapSecond = new HashMap<>();
        for(char c:arrayFirst){
            if(mapFirst.containsKey(c)){
                mapFirst.put(c,mapFirst.get(c)+1);
            }
            else {
                mapFirst.put(c,1);
            }
        }
        for(char c:arraySecond){
            if(mapSecond.containsKey(c)){
                mapSecond.put(c,mapSecond.get(c)+1);
            }
            else {
                mapSecond.put(c,1);
            }
        }

        for(Map.Entry entry: mapFirst.entrySet()){
            char key =(char) entry.getKey();
            int value =(int) entry.getValue();
            if(mapSecond.containsKey(key)){
                if(mapSecond.get(key)!=value){
                    System.out.println(key);
                    
                }
            }
            else{

            }
        }
        return count;
    }

}
