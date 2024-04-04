package org.launchcode;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[]args) {
        int[] numbers = {1,1,2,3,4,8};

        //Looping through array
        for (int number:numbers){
            System.out.println(number);
        }
        System.out.println(); //empty line

        //looping only odd numbers
        for(int number : numbers){
            if (number%2 != 0){
                System.out.println(number);
            }
        };
        System.out.println();

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println();
        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
