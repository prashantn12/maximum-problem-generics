package com.bridgelabzgenerics;



import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumNumberTest {

    // Test case for finding max Integer
    @Test
    public void givenIntegers_ShouldReturnMaximumInteger() {
        MaximumNumber<Integer> maximumNumber = new MaximumNumber<>();

        // Test for integers
        Integer result = maximumNumber.findMaximum(100, 20, 30);  // Max is 100
        assertEquals("Expected max integer is 100", (Integer) 100, result);
    }

    // Test case for finding max Float
    @Test
    public void givenFloats_ShouldReturnMaximumFloat() {
        MaximumNumber<Float> maximumNumber = new MaximumNumber<>();

        // Test for floats
        Float result = maximumNumber.findMaximum(20.5f, 30.2f, 100.5f);  // Max is 100.5
        assertEquals("Expected max float is 100.5", (Float) 100.5f, result);
    }

    // Test case for finding max String
    @Test
    public void givenStrings_ShouldReturnMaximumString() {
        MaximumNumber<String> maximumNumber = new MaximumNumber<>();

        // Test for strings
        String result = maximumNumber.findMaximum("Apple", "Peach", "Banana");  // Max is "Peach"
        assertEquals("Expected max string is Peach", "Peach", result);
    }
}
