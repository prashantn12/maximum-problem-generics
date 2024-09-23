package com.bridgelabzgenerics;

public class MaximumNumber<T extends Comparable<T>> {

    // Varargs method to find maximum from a variable number of elements
    @SafeVarargs
    public final T findMaximum(T... elements) {
        if (elements.length == 0) {
            throw new IllegalArgumentException("No elements to compare");
        }

        T max = elements[0]; // Assume the first element is the largest initially

        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
    }
}
