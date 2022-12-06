package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Govard hanReddy
 */
public class FindMaxUseGenerics {
    /**
     * find the maximum value
     */
    Integer firstNumber;
    Integer secondNumber;
    Integer thirdNumber;

    public int maxNumber(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        /**
         * maxNumber method used to find max number and return max number of Integer
         */
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
        int max = firstNumber;
        if (secondNumber.compareTo(max) == 1) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max) == 1) {
            max = thirdNumber;
        }
        return max;
    }

    public static void main(String[] args) {
        /**
         * in this method call the maxNumber method through object and print max number of Integer
         */
        Scanner input = new Scanner(System.in);
        FindMaxUseGenerics max = new FindMaxUseGenerics();
        System.out.print("Enter first number : ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number : ");
        int secondNumber = input.nextInt();
        System.out.print("Enter first number : ");
        int thirdNumber = input.nextInt();
        int maxNumber = max.maxNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println("Largest number is " + maxNumber);
    }
}
