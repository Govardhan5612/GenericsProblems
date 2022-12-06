package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Govard hanReddy
 */
public class FindMaxUseGenerics {
    /**
     * find the maximum string
     */
    String firstValue;
    String secondValue;
    String thirdValue;

    public String maxNumber(String firstValue, String secondValue, String thirdValue) {
        /**
         * maxNumber method used to find max number and return max value of Strings
         */
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
        String max = firstValue;
        if (secondValue.compareTo(max) == 1) {
            max = secondValue;
        }
        if (thirdValue.compareTo(max) == 1) {
            max = thirdValue;
        }
        return max;
    }

    public static void main(String[] args) {
        /**
         * in this method call the maxNumber method through object and print max value of String
         * Eg - Apple,Peach,Banana
         */
        Scanner input = new Scanner(System.in);
        FindMaxUseGenerics max = new FindMaxUseGenerics();
        System.out.print("Enter first String value : ");
        String firstValue = input.next();
        System.out.print("Enter second String value : ");
        String secondValue = input.next();
        System.out.print("Enter third String value : ");
        String thirdValue = input.next();
        String maxValue = max.maxNumber(firstValue, secondValue, thirdValue);
        System.out.println("Largest String value is " + maxValue);
    }
}
