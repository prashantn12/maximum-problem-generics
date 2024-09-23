package com.bridgelabzgenerics;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumNumberTest {

    // Test case for finding max Integer using the generic class
    @Test
    public void givenThreeIntegers_ShouldReturnMaximumInteger() {
        MaximumNumber<Integer> maximumNumber = new MaximumNumber<>(10, 20, 30);

        Integer result = maximumNumber.testMaximum();  // Max is 30
        assertEquals("Expected max integer is 30", (Integer) 30, result);
    }

    // Test case for finding max Float using the generic class
    @Test
    public void givenThreeFloats_ShouldReturnMaximumFloat() {
        MaximumNumber<Float> maximumNumber = new MaximumNumber<>(10.5f, 30.5f, 20.5f);

        Float result = maximumNumber.testMaximum();  // Max is 30.5
        assertEquals("Expected max float is 30.5", (Float) 30.5f, result);
    }

    // Test case for finding max String using the generic class
    @Test
    public void givenThreeStrings_ShouldReturnMaximumString() {
        MaximumNumber<String> maximumNumber = new MaximumNumber<>("Apple", "Peach", "Banana");

        String result = maximumNumber.testMaximum();  // Max is "Peach"
        assertEquals("Expected max string is Peach", "Peach", result);
    }
}
