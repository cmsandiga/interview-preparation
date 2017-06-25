package geekforgeek;

import org.junit.Assert;
import org.junit.Test;
import util.Pair;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by makoto on 25/06/17.
 */
public class OrderedModPairTest {

    @Test
    public void bruteForce() {
        Set<Pair> set = new HashSet<>();
        set.add(new Pair(7, 4));
        set.add(new Pair(3, 4));
        set.add(new Pair(3, 5));
        set.add(new Pair(3, 7));

        int[] arr = {2, 3, 5, 4, 7};
        int k = 3;
        List<Pair> pairs = new OrderedModPair().findPairs(arr, 3);

        Assert.assertEquals(4, pairs.size());
        Assert.assertTrue(set.contains(pairs.get(0)));
        Assert.assertTrue(set.contains(pairs.get(1)));
        Assert.assertTrue(set.contains(pairs.get(2)));
        Assert.assertTrue(set.contains(pairs.get(3)));
    }
}

