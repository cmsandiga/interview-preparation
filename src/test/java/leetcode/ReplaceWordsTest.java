package leetcode;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author <a href="mailto:csandiga@uolinc.com">Makoto Sandiga</a>
 * @since 2017-07-28
 */
public class ReplaceWordsTest {

    @Test
    public void test() {

        List<String> dict = Arrays.asList("cat", "bat", "rat");
        String sentence = "the cattle was rattled by the battery";

        String result = ReplaceWords.execute(dict, sentence);

        Assert.assertEquals("the cat was rat by the bat", result);
    }

}