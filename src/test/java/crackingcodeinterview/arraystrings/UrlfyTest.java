package crackingcodeinterview.arraystrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by makoto on 16/06/17.
 */
public class UrlfyTest {

    @Test
    public void test1(){
        String input = "Mr Mak  ";
        int N = 6;

        String output = URLfy.urlfy(input, N);

        Assert.assertEquals("Mr%20Mak", output);
    }

    @Test
    public void test2(){
        String input = "Mr Mr Mak    ";
        int N = 9;

        String output = URLfy.urlfy(input, N);

        Assert.assertEquals("Mr%20Mr%20Mak", output);
    }

    @Test
    public void test3(){
        String input = "abc abc abc abc      ";
        int N = 15;

        String output = URLfy.urlfy(input, N);

        Assert.assertEquals("abc%20abc%20abc%20abc", output);
    }
}
