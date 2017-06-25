package crackingcodeinterview.arraystrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by makoto on 18/06/17.
 */
public class PalindromePermutationTest {

    @Test
    public void test() {

        String input = "Tact Coa";
        boolean result = PalindromePermutation.isPalindromePermutation(input);
        Assert.assertEquals(true, result);
    }

}
