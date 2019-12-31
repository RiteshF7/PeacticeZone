package com.company.HackerRankInitialProbs;

public class TimeConversionProblem {

    public static void main(String[] args){
        String s = "12:45:54PM";
        if(s.contains("AM")){
            s=s.replace("AM","");
            String arr[] = s.split(":");
            if(arr[0].equals("12")){
               arr[0]="00";
            }
            print(arr[0]+":"+arr[1]+":"+arr[2]);
        }
        else {
            s=s.replace("PM","");
            String arr[] = s.split(":");
            int hour = Integer.parseInt(arr[0])+12;
            if(arr[0].equals("12")){
                print("12"+":"+arr[1]+":"+arr[2]);
            }
            else{
                print(hour+":"+arr[1]+":"+arr[2]);
            }


        }

    }
    static void print(String s){
        System.out.println(s);
    }
}
