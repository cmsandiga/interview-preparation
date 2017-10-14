package dpbook;

import org.junit.Assert;
import org.junit.Test;

public class Question_1_1Test {

    @Test
    public void test() {

        int fact = new Question_1_1().fact(4);
        Assert.assertEquals(24, fact);
    }

}