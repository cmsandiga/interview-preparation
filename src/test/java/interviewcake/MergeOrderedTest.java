package interviewcake;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by makoto on 25/06/17.
 */
public class MergeOrderedTest {

    @Test
    public void test() {

        List<Integer> myList = Arrays.asList(3, 4, 6, 10, 11, 15);
        List<Integer> aliceList = Arrays.asList(1, 5, 8, 12, 14, 19);

        List<Integer> answer = Arrays.asList(1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 19);

        List<Integer> result = new MergeOrdered().order(myList, aliceList);

        Assert.assertEquals(answer.size(), result.size());

        for (int i = 0; i < answer.size(); i++) {
            Assert.assertEquals(answer.get(i), result.get(i));
        }
    }
}
