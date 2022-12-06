package com.bridgelabz;

import java.util.Arrays;

/**
 * @author Govard hanReddy
 */
public class FindMaxUseGenerics {
    /**
     * find the maximum values using generic method
     */

    public static<T> void maxNumber(T[] array) {
        /**
         * maxNumber Generic method used to find max value and return max value
         * use Arrays class sort static method to print the array in ascending order
         */
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Maximum value is "+array[array.length-1]);
    }

    public static void main(String[] args) {
        /**
         * In this method use method level generics to print all object array in single generic method
         */
        Integer[] integerArray = {1, 5, 7, 8, 9, 6, 4};
        String[] stringArray = {"Ram", "Ravi", "Raju", "Surya"};
        Float[] floatArray = {1.5f, 6.5f, 4.5f, 8.4f, 1.3f, 6.5f};
        System.out.println("Print Integer array :- ");
        maxNumber(integerArray);
        System.out.println("************************");
        System.out.println("Print Float array :- ");
        maxNumber(floatArray);
        System.out.println("************************");
        System.out.println("Print String array :- ");
        maxNumber(stringArray);
    }
}
