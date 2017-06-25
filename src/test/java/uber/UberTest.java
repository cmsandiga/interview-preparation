package uber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by makoto on 21/05/17.
 */
public class UberTest {

    @Test
    public void solveEmpty() {
        String input = "ACTCGTAAAAA";

        Assert.assertEquals("", new Uber().solve(input));

    }

    @Test
    public void solveUber() {
        String input = "ACTACGTTTAGTAACTCGTCT";

        Assert.assertEquals("AGTAACTCGT", new Uber().solve(input));
    }


    @Test
    public void solve2() {
        String input = "AGTACTCGT";

        Assert.assertEquals("AGTACTCGT", new Uber().solve(input));
    }


    @Test
    public void solve3() {
        String input = "AAAAAAAAAGTACTCGT";

        Assert.assertEquals("AGTACTCGT", new Uber().solve(input));
    }

    @Test
    public void solve4() {
        String input = "CGTAGTACT";

        Assert.assertEquals("CGTAGTACT", new Uber().solve(input));
    }

    @Test
    public void solve5() {
        String input = "AGTCGTACT";

        Assert.assertEquals("AGTCGTACT", new Uber().solve(input));
    }

    @Test
    public void solve6() {
        String input = "AGTAAAAAAACGTBBBBBBBBACT";

        Assert.assertEquals("AGTAAAAAAACGTBBBBBBBBACT", new Uber().solve(input));
    }

    @Test
    public void solve7() {
        String input = "AGTAAAAAAACGTBBBBBBBBACTBBBBAGTACTCGT";

        Assert.assertEquals("AGTACTCGT", new Uber().solve(input));
    }
}
