package com.bridgelabzgenerics;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumNumberTest {

    // Test Case 1.1: Max Float at First Position
    @Test
    public void givenMaxFloatAtFirstPosition_ShouldReturnSameNumber() {
        MaximumNumber<Float> maximumNumber = new MaximumNumber<>();

        // Test data with max number at the first position
        Float[] testData = {100.5f, 20.2f, 30.3f};  // 100.5 is the max

        Float result = maximumNumber.findMaximum(testData);

        assertEquals("Test case failed! Expected max at 1st position is 100.5", (Float) 100.5f, result);
    }

    // Test Case 1.2: Max Float at Second Position
    @Test
    public void givenMaxFloatAtSecondPosition_ShouldReturnSameNumber() {
        MaximumNumber<Float> maximumNumber = new MaximumNumber<>();

        // Test data with max number at the second position
        Float[] testData = {20.1f, 100.5f, 30.3f};  // 100.5 is the max

        Float result = maximumNumber.findMaximum(testData);

        assertEquals("Test case failed! Expected max at 2nd position is 100.5", (Float) 100.5f, result);
    }

    // Test Case 1.3: Max Float at Third Position
    @Test
    public void givenMaxFloatAtThirdPosition_ShouldReturnSameNumber() {
        MaximumNumber<Float> maximumNumber = new MaximumNumber<>();

        // Test data with max number at the third position
        Float[] testData = {20.1f, 30.2f, 100.5f};  // 100.5 is the max

        Float result = maximumNumber.findMaximum(testData);

        assertEquals("Test case failed! Expected max at 3rd position is 100.5", (Float) 100.5f, result);
    }
}
