package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Govard hanReddy
 */
public class FindMaxUseGenerics {
    /**
     * find the maximum float value
     */
    Float firstNumber;
    Float secondNumber;
    Float thirdNumber;

    public float maxNumber(Float firstNumber, Float secondNumber, Float thirdNumber) {
        /**
         * maxNumber method used to find max number and return max number of Floats
         */
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
        float max = firstNumber;
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
         * in this method call the maxNumber method through object and print max number of Floats
         */
        Scanner input = new Scanner(System.in);
        FindMaxUseGenerics max = new FindMaxUseGenerics();
        System.out.print("Enter first number : ");
        float firstNumber = input.nextFloat();
        System.out.print("Enter second number : ");
        float secondNumber = input.nextFloat();
        System.out.print("Enter first number : ");
        float thirdNumber = input.nextFloat();
        float maxNumber = max.maxNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println("Largest float number is " + maxNumber);
    }
}
