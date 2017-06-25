package crackingcodeinterview.arraystrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by makoto on 16/06/17(input.length() - 1) == i.
 */
public class StringCompressionTest {

    @Test
    public void basicTest() {
        String input = "aaaccc";
        String compress = StringCompression.compress(input);

        Assert.assertEquals("a3c3", compress);
    }

    @Test
    public void compressOneCharacter() {
        String input = "aaaaaaa";
        String compress = StringCompression.compress(input);

        Assert.assertEquals("a7", compress);
    }

    @Test
    public void shouldReturnTheInput() {
        String input = "a";
        String compress = StringCompression.compress(input);

        Assert.assertEquals("a", compress);
    }

    @Test
    public void test2() {
        String input = "abc";
        String compress = StringCompression.compress(input);

        Assert.assertEquals("abc", compress);
    }

    @Test
    public void test3() {
        String input = "aaabcccd";
        String compress = StringCompression.compress(input);

        Assert.assertEquals("a3b1c3d1", compress);
    }

    @Test
    public void test4() {
        String input = "aa";
        String compress = StringCompression.compress(input);

        Assert.assertEquals("aa", compress);
    }
}

