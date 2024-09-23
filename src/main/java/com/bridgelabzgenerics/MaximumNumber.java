package com.bridgelabzgenerics;

public class MaximumNumber<T extends Comparable<T>> {

    // Method to find maximum in an array of elements
    public T findMaximum(T[] elements) {
        if (elements.length == 0) {
            throw new IllegalArgumentException("Array is empty");
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
