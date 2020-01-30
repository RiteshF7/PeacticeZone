package com.company.HackerRankInitialProbs;

import java.util.HashMap;

public class Anagrams {

    public static void main(String []args){
        String a="hello";
        System.out.println(a);
        HashMap<Character,Integer> mymap = new HashMap<>();

        for(int i=0;i<a.length();i++){

            if(mymap.containsKey(a.charAt(i))){
                mymap.put(a.charAt(i),mymap.get(a.charAt(i)+1));
                System.out.println(mymap.get(a.charAt(i)));
            }
            else{
                mymap.put(a.charAt(i),1);
            }

        }

        System.out.println(mymap.get("l"));

    }
}
