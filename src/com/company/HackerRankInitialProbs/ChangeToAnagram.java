package com.company.HackerRankInitialProbs;

import java.util.HashMap;
import java.util.Map;

public class ChangeToAnagram {

    public static void main(String[] args){
        String[] testCases ={"aaabbb" ,"ab","abc","mnop","xyyx" ,"xaxbbbxx"};
        int changes =0;
        for(String testcase : testCases){
            changes = countChangesone(testcase);
            System.out.println(changes);
        }
    }

    //this is relatively fast solution then method below using hashmaps :)
    public static int countChangesone(String testcase){
        int len = testcase.length();
        int count =0;
        if(len%2!=0){
            count=-1;
            return count;
        }
        String firstHalf =testcase.substring(0,len/2);
        String secondHalf =testcase.substring(len/2,len);
        HashMap<Character,Integer>  charMapFirst = new HashMap<>();
        HashMap<Character,Integer>  charMapSecond = new HashMap<>();
        for(int i=0;i<firstHalf.length();i++){
            char ch = firstHalf.charAt(i);
            char chB =secondHalf.charAt(i);
            if(charMapFirst.containsKey(ch)){
                charMapFirst.put(ch,charMapFirst.get(ch)+1);
            }
            else{
                charMapFirst.put(ch,1);
            }

            if(charMapSecond.containsKey(chB)){
                charMapSecond.put(chB,charMapSecond.get(chB)+1);
            }
            else{
                charMapSecond.put(chB,1);
            }
        }

        for(Map.Entry mapElement : charMapFirst.entrySet()){
            char key = (char) mapElement.getKey();
            if(charMapSecond.containsKey(key)){
                if(charMapFirst.get(key)!=charMapSecond.get(key)){
                    if(charMapFirst.get(key)>charMapSecond.get(key)){
                        count+=charMapFirst.get(key)-charMapSecond.get(key);
                    }
                }
            }
            else {
                    count+=charMapFirst.get(key);
                }
        }
        return count;
    }

    //this method is also correct but gives timeout error
    public static int countChanges(String testcase){
        int len = testcase.length();
        int count =0;
        if(len%2!=0){
            count=-1;
            return count;
        }
        String firstHalf =testcase.substring(0,len/2);
        String secondHalf =testcase.substring(len/2,len);
        char[] arrayFirstHalf =firstHalf.toCharArray();
        char[] arraySecondHalf = secondHalf.toCharArray();
        for(int i=0;i<arrayFirstHalf.length;i++){
                char cha = arrayFirstHalf[i];
                for(int j=0;j<arraySecondHalf.length;j++){
                char chb = arraySecondHalf[j];
                if(cha==chb){
                    firstHalf =firstHalf.replaceFirst(cha+"","");
                    secondHalf =secondHalf.replaceFirst(chb+"","");
                    arraySecondHalf[j]='-';
                    break;
                }

            }

        }
        count = firstHalf.length();
        return count;
    }
}
