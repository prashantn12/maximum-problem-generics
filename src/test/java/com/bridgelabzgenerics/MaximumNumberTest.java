package com.bridgelabzgenerics;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumNumberTest {

    // Test Case 1.1: Max String at First Position
    @Test
    public void givenMaxStringAtFirstPosition_ShouldReturnSameString() {
        MaximumNumber<String> maximumNumber = new MaximumNumber<>();

        // Test data with max string at the first position
        String[] testData = {"Peach", "Apple", "Banana"};  // Peach is the lexicographically largest

        String result = maximumNumber.findMaximum(testData);

        assertEquals("Test case failed! Expected max at 1st position is Peach", "Peach", result);
    }

    // Test Case 1.2: Max String at Second Position
    @Test
    public void givenMaxStringAtSecondPosition_ShouldReturnSameString() {
        MaximumNumber<String> maximumNumber = new MaximumNumber<>();

        // Test data with max string at the second position
        String[] testData = {"Apple", "Peach", "Banana"};  // Peach is the max string at second position

        String result = maximumNumber.findMaximum(testData);

        assertEquals("Test case failed! Expected max at 2nd position is Peach", "Peach", result);
    }

    // Test Case 1.3: Max String at Third Position
    @Test
    public void givenMaxStringAtThirdPosition_ShouldReturnSameString() {
        MaximumNumber<String> maximumNumber = new MaximumNumber<>();

        // Test data with max string at the third position
        String[] testData = {"Apple", "Banana", "Peach"};  // Peach is the max string at third position

        String result = maximumNumber.findMaximum(testData);

        assertEquals("Test case failed! Expected max at 3rd position is Peach", "Peach", result);
    }
}
