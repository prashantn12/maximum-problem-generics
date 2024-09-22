package com.bridgelabzgenerics;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumNumberTest {

    @Test
    public void givenMaxNumberAtThirdPosition_ShouldReturnSameNumber() {
        MaximumNumber<Integer> maximumNumber = new MaximumNumber<>();

        // Test data with max number at the third position
        Integer[] testData = {20, 30, 100};  // 100 is the max number at the third position

        // Invoke the method and get the result
        Integer result = maximumNumber.findMaximum(testData);

        // Assert that the result is the expected value (100)
        assertEquals("Test case failed! Expected max at 3rd position is 100", (Integer) 100, result);
    }
}
