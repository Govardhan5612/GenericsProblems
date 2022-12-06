package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Govard hanReddy
 */
public class FindMaxUseGenerics {
    /**
     * find the maximum values using generic methods
     */


    public static <T extends Comparable<T>> void maxNumber(T firstValue, T secondValue, T thirdValue) {
        /**
         * maxNumber Generic method used to find max number and return max value
         */

        T maxValue = firstValue;
        if (secondValue.compareTo(maxValue) == 1) {
            maxValue = secondValue;
        }
        if (thirdValue.compareTo(maxValue) == 1) {
            maxValue = thirdValue;
        }
        System.out.println("Maximum value : " + maxValue);
    }

    public static void main(String[] args) {
        /**
         * in this method call the maxNumber method  print max value
         * string Eg - Apple,Peach,Banana
         */
        String firstValue = "Apple";
        String secondValue = "Peach";
        String thirdValue = "Banana";
        System.out.println("Max String :-");
        /**
         * use generic method to use find max string value
         */
        maxNumber(firstValue, secondValue, thirdValue);
        Integer firstIntNumber = 124;
        Integer secondIntNumber = 136;
        Integer thirdIntNumber = 120;
        System.out.println("Max Integer :-");
        /**
         * use generic method to use find max Integer number
         */
        maxNumber(firstIntNumber, secondIntNumber, thirdIntNumber);
        Float firstFloatNumber = 20.5f;
        Float secondFloatNumber = 30.2f;
        Float thirdFloatNumber = 20.8f;
        System.out.println("Max Integer :-");
        /**
         * use generic method to use find max Float number
         */
        maxNumber(firstFloatNumber, secondFloatNumber, thirdFloatNumber);


    }
}
