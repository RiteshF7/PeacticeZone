package com.company.HackerRankInitialProbs;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class FractionOfIntegers {
    public static void main(String[] args) {
        int arr[] = new int[]{0 ,0 ,-1, 1, 1};
        double freqOfpos = 0;
        double freqOfneg = 0;
        double freqOfZero = 0;
        for (int i = 0; i < arr.length; i++) {
            int type = checkType(arr[i]);
            switch (type) {
                case 1:
                    freqOfpos++;
                    break;
                case -1:
                    freqOfneg++;
                    break;
                case 0:
                    freqOfZero++;
                    break;
            }
        }
        print(freqOfpos, arr.length);
        print(freqOfneg, arr.length);
        print(freqOfZero, arr.length);
    }

    public static void print(double freq, int lenght) {
        double fraction = freq / lenght;
        Double truncatedDouble = BigDecimal.valueOf(fraction)
                .setScale(6, RoundingMode.HALF_UP)
                .doubleValue();
        System.out.println(truncatedDouble + "");
    }

    public static int checkType(int i) {
        if (i > 0) {
            return 1;
        } else if (i < 0) {
            return -1;
        } else {
            return 0;
        }

    }
}
