package com.bridgelabzgenerics;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumNumberTest {

    // Test case for finding max Integer with more than three elements
    @Test
    public void givenMultipleIntegers_ShouldReturnMaximumInteger() {
        MaximumNumber<Integer> maximumNumber = new MaximumNumber<>(10, 20, 30, 40, 50);

        Integer result = maximumNumber.testMaximum();  // Max is 50
        assertEquals("Expected max integer is 50", (Integer) 50, result);
    }

    // Test case for finding max Float with more than three elements
    @Test
    public void givenMultipleFloats_ShouldReturnMaximumFloat() {
        MaximumNumber<Float> maximumNumber = new MaximumNumber<>(10.5f, 30.5f, 20.5f, 50.5f, 40.5f);

        Float result = maximumNumber.testMaximum();  // Max is 50.5
        assertEquals("Expected max float is 50.5", (Float) 50.5f, result);
    }

    // Test case for finding max String with more than three elements
    @Test
    public void givenMultipleStrings_ShouldReturnMaximumString() {
        MaximumNumber<String> maximumNumber = new MaximumNumber<>("Apple", "Peach", "Banana", "Mango", "Grape");

        String result = maximumNumber.testMaximum();  // Max is "Peach"
        assertEquals("Expected max string is Peach", "Peach", result);
    }
}
