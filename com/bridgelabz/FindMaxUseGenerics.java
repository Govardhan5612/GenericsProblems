package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Govard hanReddy
 */
public class FindMaxUseGenerics<T extends Comparable<T>> {
    /**
     * find the maximum values using generic class
     */
    T firstValue, secondValue, thirdValue;

    public FindMaxUseGenerics(T firstValue, T secondValue, T thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public void maxNumber() {
        /**
         * maxNumber Generic class used to find max number and return max value
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
         * use generic class to use find max string value
         */
        FindMaxUseGenerics maxOfString = new FindMaxUseGenerics(firstValue, secondValue, thirdValue);
        maxOfString.maxNumber();
        Integer firstIntNumber = 124;
        Integer secondIntNumber = 136;
        Integer thirdIntNumber = 120;
        System.out.println("Max Integer :-");
        /**
         * use generic class to use find max Integer number
         */
        FindMaxUseGenerics maxOfInteger = new FindMaxUseGenerics(firstIntNumber, secondIntNumber, thirdIntNumber);
        maxOfInteger.maxNumber();
        Float firstFloatNumber = 20.5f;
        Float secondFloatNumber = 30.2f;
        Float thirdFloatNumber = 20.8f;
        System.out.println("Max Float :-");
        /**
         * use generic class to use find max Float number
         */
        FindMaxUseGenerics maxOfFloat = new FindMaxUseGenerics(firstFloatNumber, secondFloatNumber, thirdFloatNumber);
        maxOfFloat.maxNumber();
    }
}
