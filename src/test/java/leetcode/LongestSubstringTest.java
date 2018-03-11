package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringTest {

    @Test
    public void shouldReturnLongestSubString() {

        int counter = new LongestSubstring().logestSubstring("tmmzuxt");
        Assert.assertEquals(4, counter);
    }
}