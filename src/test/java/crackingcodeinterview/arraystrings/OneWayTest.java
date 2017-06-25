package crackingcodeinterview.arraystrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by makoto on 18/06/17.
 */
public class OneWayTest {

    @Test
    public void test() {
        String a = "pale";
        String b = "ple";

        boolean result = OneWay.oneWay(a, b);

        Assert.assertEquals(true, result);
    }

    @Test
    public void test2() {
        String a = "pale";
        String b = "pal";

        boolean b1 = OneWay.oneWay(a, b);
        boolean result = b1;

        Assert.assertEquals(true, result);
    }

    @Test
    public void test3() {
        String a = "pale";
        String b = "pale";

        boolean result = OneWay.oneWay(a, b);

        Assert.assertEquals(true, result);
    }

    @Test
    public void test4() {
        String a = "pale";
        String b = "pale";

        boolean result = OneWay.oneWay(a, b);

        Assert.assertEquals(true, result);
    }

    @Test
    public void test5() {
        String a = "pale";
        String b = "pa";

        boolean result = OneWay.oneWay(a, b);

        Assert.assertEquals(false, result);
    }
}
