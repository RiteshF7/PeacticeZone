package com.company.HackerRankInitialProbs;

public class StarecaseHash {

    public static void main(String[] args){
        String hash = "#";
        String nextLine ="\n";
        String space =" ";
        int input =8;int spaceno=input-1;int hashno=1;
        for(int i=0;i<input;i++){
            for(int j=0;j<spaceno;j++){
                print(space);
            }
            for(int j=0;j<hashno;j++){
                print(hash);
            }
            spaceno--;
            hashno++;
            print(nextLine);

        }
      //  print(hash+hash+nextLine+hash+hash);


    }

    public static void print(String s){
        System.out.print(s);
    }

}
