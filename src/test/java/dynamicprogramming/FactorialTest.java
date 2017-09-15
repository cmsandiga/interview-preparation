package dynamicprogramming;

import dynamicprogramming.ch1.Factorial;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author <a href="mailto:csandiga@uolinc.com">Makoto Sandiga</a>
 * @since 2017-09-14
 */
public class FactorialTest {

    @Test
    public void factorial() {
        int result = new Factorial().factorial(5);

        Assert.assertEquals(120, result);
    }
}