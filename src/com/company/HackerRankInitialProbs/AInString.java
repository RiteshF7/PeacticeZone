package com.company.HackerRankInitialProbs;

import com.sun.deploy.util.StringUtils;

public class AInString {

    public static void main(String[] args) {

        String input = "aba";
        long num = 10;
        repeatedString(input, num);

    }

    static long repeatedString(String s, long n) {
        char c[] = s.toCharArray();
        String newString ="";
        int count = 0;

        long leftover = (n % c.length);

        System.out.println(count);
        return count;
    }
}
