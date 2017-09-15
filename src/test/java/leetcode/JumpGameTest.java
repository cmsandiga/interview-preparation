package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author <a href="mailto:csandiga@uolinc.com">Makoto Sandiga</a>
 * @since 2017-08-23
 */
public class JumpGameTest {

    @Test
    public void shouldPass1() {
        //[2,3,1,1,4]
        int[] nums = {2,3,1,1,4};
        boolean result = JumpGame.canJump(nums);
        Assert.assertEquals(true, result);
    }

    @Test
    public void shouldPass2() {
        //[2,3,1,1,4]
        int [] nums = new int[]{3,2,1,0,4};
        boolean result = JumpGame.canJump(nums);
        Assert.assertEquals(false, result);
    }

    @Test
    public void shouldPass3() {
        int [] nums = new int[]{1,2,3};
        boolean result = JumpGame.canJump(nums);
        Assert.assertEquals(true, result);

    }

    @Test
    public void shouldPass4() {
        int []nums = new int[]{4,2,0,0,1,1,4,4,4,0,4,0};
        boolean result = JumpGame.canJump(nums);
        Assert.assertEquals(true, result);

    }

    @Test
    public void shouldPass5() {
        int []nums = new int[]{1,1,1,0};
        boolean result = JumpGame.canJump(nums);
        Assert.assertEquals(true, result);
    }

    @Test
    public void shouldPass6() {
        int []nums = new int[]{1,1,2,2,0,1,1};
        boolean result = JumpGame.canJump(nums);
        Assert.assertEquals(true, result);
    }
}