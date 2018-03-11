package leetcode.contest75;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateStringTest {

    @Test
    public void shouldReturnTrueWhenStringIsRotate(){

        String a = "abcde";
        String b = "cdeab";

        RotateString rs = new RotateString();
        boolean result = rs.isRotateString(a,b);

        Assert.assertTrue("Should return true ",result);
    }
}