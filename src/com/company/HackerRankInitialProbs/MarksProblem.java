package com.company.HackerRankInitialProbs;

import java.util.ArrayList;
import java.util.List;

public class MarksProblem {

    public static void main(String[] args){
        List<Integer> marks = new ArrayList<>();
        marks.add(42);
        List<Integer> out = gradingStudents(marks);
        for(int g:out){
            System.out.println(g);
        }

    }
    public static List<Integer> gradingStudents(List<Integer> grades) {

        for(int g=0;g<grades.size();g++){

            if(grades.get(g)>=38){
                int nextMultipleOfFive = 5 - (grades.get(g) % 5) + grades.get(g);
                System.out.println((grades.get(g) % 5));
                if (nextMultipleOfFive - grades.get(g) < 3) {
                    grades.set(g,nextMultipleOfFive);
                }
            }

        }

        return grades;
    }

}
