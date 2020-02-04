package com.company.HackerRankInitialProbs;

import java.util.HashMap;

public class Anagrams {

    public static void main(String []args){
        String a="Dormitory";
        String b= "Dirtyroom";
        HashMap<Character,Integer> charMapA = new HashMap<>();
        HashMap<Character,Integer> charMapB = new HashMap<>();
        if(a.length()!=b.length()){
            System.out.println("Not anagram");
            return;
        }

        char[] arrayA=a.toCharArray();
        char[] arrayB=b.toCharArray();
        for(int i=0;i<arrayA.length;i++){
            if(charMapA.containsKey(arrayA[i])){
                charMapA.put(arrayA[i],charMapA.get(arrayA[i])+1);
            }
            else {
                charMapA.put(arrayA[i],1);
            }

            if(charMapB.containsKey(arrayB[i])){
                charMapB.put(arrayB[i],charMapB.get(arrayB[i])+1);
            }
            else {
                charMapB.put(arrayB[i],1);
            }


        }

        if(charMapA.equals(charMapB)){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not anagram");
        }

    }

    public static  boolean mapsAreEqual(HashMap<Character, Integer> mapA,HashMap<Character, Integer> mapB) {

        try{
            for (int k : mapB.keySet())
            {
                if (!mapA.get(k).equals(mapB.get(k))) {
                    return false;
                }

            }
            for (int y : mapA.keySet())
            {
                if (!mapB.containsKey(y)) {
                    return false;
                }

            }
        } catch (NullPointerException np) {
            return false;
        }
        return true;
    }

}
