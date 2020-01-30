package com.company.HackerRankInitialProbs;

public class CloudJumpProblem {
    public static void main(String[] args) {
        int input[] = {0, 0, 1, 0, 1, 0};
        jumpingOnClouds(input);
    }

    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int currentCloud = 0;
        for (int n = 0; n < c.length; n++) {

            if (c[currentCloud + 2] == 0) {
                jumps++;
                currentCloud = currentCloud + 2;

            } else {
                jumps++;
                currentCloud = currentCloud + 1;
            }
            System.out.println(currentCloud + "cc");
            System.out.println(c.length + "s");
            if (currentCloud == c.length - 2 ) {
                jumps++;
                System.out.println(jumps);
                return jumps;
            }
            if(currentCloud == c.length - 1){
                return jumps;
            }
        }

        return jumps;
    }
}
