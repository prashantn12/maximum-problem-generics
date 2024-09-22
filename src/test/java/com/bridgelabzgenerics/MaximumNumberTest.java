package com.bridgelabzgenerics;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumNumberTest {

    @Test
    public void givenMaxNumberAtFirstPosition_ShouldReturnSameNumber() {
        MaximumNumber<Integer> maximumNumber = new MaximumNumber<>();

        // Test data with max number at the first position
        Integer[] testData = {100, 20, 30};  

        // Invoke the method and get the result
        Integer result = maximumNumber.findMaximum(testData);

        // Assert that the result is the expected value (100)
        assertEquals("Test case failed! Expected max at 1st position is 100", (Integer) 100, result);
    }
}
