package com.company.HackerRankInitialProbs;

public class KangarooProb {
    int[] input={0,3,4,2};
    public static void main(String[] args){
//        1817 9931 8417 190

//        1571 4240 9023 4234
//        43 2 70 2
    checkFun(43,2,70,2);
    }
    static String checkFun(int pos1,int jum1,int pos2,int jum2){
       if(pos1<pos2&&jum1==jum2){
           return "NO";
       }
        int r=(pos2-pos1)%(jum1-jum2);
       if(jum1>jum2) {
           if (r == 0) {
               System.out.print("YES");
               return "YES";
           } else {
               System.out.print("NO");
               return "NO";
           }
       }
        System.out.print("NO");
       return "NO";
    }
}
