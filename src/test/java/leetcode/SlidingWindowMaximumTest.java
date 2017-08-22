package leetcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

/**
 * @author <a href="mailto:csandiga@uolinc.com">Makoto Sandiga</a>
 * @since 2017-08-22
 */
public class SlidingWindowMaximumTest {

    @Test
    public void shouldPass() throws FileNotFoundException {
        Scanner dis = new Scanner(new File("/home/csandiga/test.txt"));
        dis.useDelimiter(",");
        List<Integer> arraylist = new ArrayList<>();
        while (dis.hasNext()) {
            arraylist.add(dis.nextInt());
        }

        int[] maxSlidingWindow = new SlidingWindowMaximum().maxSlidingWindow(arraylist.stream().mapToInt(i -> i).toArray(), 5000);
        System.out.println(Arrays.toString(maxSlidingWindow));
    }
}