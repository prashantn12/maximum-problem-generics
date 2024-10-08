package com.bridgelabzgenerics;


import java.util.Arrays;
import java.util.Collections;

public class MaximumNumber<T extends Comparable<T>> {
    private T[] elements;

    // Constructor to initialize the array of elements
    @SafeVarargs
    public MaximumNumber(T... elements) {
        this.elements = elements;
    }

    // Instance method to find and print the maximum of instance variables
    public T testMaximum() {
        T maxValue = MaximumNumber.testMaximum(elements);
        printMax(maxValue);
        return maxValue;
    }

    // Static method to find the maximum of more than three elements
    @SafeVarargs
    public static <T extends Comparable<T>> T testMaximum(T... elements) {
        if (elements.length == 0) {
            throw new IllegalArgumentException("No elements to compare");
        }

        // Sort the array of elements in descending order
        Arrays.sort(elements, Collections.reverseOrder());

        // The maximum element will be the first element after sorting
        return elements[0];
    }

    // Generic method to print the maximum value
    public void printMax(T maxValue) {
        System.out.println("The maximum value is: " + maxValue);
    }
}

