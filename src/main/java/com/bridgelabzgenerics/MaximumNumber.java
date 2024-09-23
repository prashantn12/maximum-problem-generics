package com.bridgelabzgenerics;



public class MaximumNumber<T extends Comparable<T>> {
    private T first;
    private T second;
    private T third;

    // Constructor to initialize the three variables
    public MaximumNumber(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    // Instance method to find the maximum of instance variables
    public T testMaximum() {
        return MaximumNumber.testMaximum(first, second, third);
    }

    // Static method to find the maximum of three values
    public static <T extends Comparable<T>> T testMaximum(T first, T second, T third) {
        T max = first; // Assume first is the maximum initially

        if (second.compareTo(max) > 0) {
            max = second;
        }
        if (third.compareTo(max) > 0) {
            max = third;
        }

        return max;
    }
}

