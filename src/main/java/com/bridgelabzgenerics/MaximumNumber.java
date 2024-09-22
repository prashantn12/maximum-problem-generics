package com.bridgelabzgenerics;

public class MaximumNumber<T extends Comparable<T>> {

    // Method to find maximum in an array of numbers
    public T findMaximum(T[] elements) {
        if (elements.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        T max = elements[0];

        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        MaximumNumber<Integer> maximum = new MaximumNumber<>();

        Integer[] array1 = {10, 20, 30};

        System.out.println("Maximum of " + maximum.findMaximum(array1)); // 30

    }
}

