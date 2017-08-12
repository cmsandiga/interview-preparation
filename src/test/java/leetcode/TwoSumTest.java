package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {

    @Test
    public void twoSum(){

        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = TwoSum.twoSum(nums, target);

        assertEquals(0, result[0]);
        assertEquals(1, result[1]);

    }
}