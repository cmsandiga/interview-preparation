package uber;

import org.junit.Assert;
import org.junit.Test;
import util.Travel;

import java.util.Arrays;
import java.util.List;

/**
 * Created by makoto on 26/06/17.
 */
public class RoutingProblemTest {

    // Input:
    // Geary -> Polk
    // Bush -> Turk
    // Polk -> Market
    // Turk -> Geary

    // Output:
    // 1 Bush -> Turk ->  Geary ->  Polk -> Market
    @Test
    public void test() {

        Travel pair1 = new Travel("Bush", "Turk");
        Travel pair2 = new Travel("Geary", "Polk");
        Travel pair3 = new Travel("Polk", "Market");
        Travel pair4 = new Travel("Turk", "Geary");

        List<Travel> pairs = Arrays.asList(pair1, pair2, pair3, pair4);//, pair4, pair5, pair6);

        List<List<String>> routes = new RoutingProblem().findRoutes(pairs);

        Assert.assertEquals(1, routes.size());
        Assert.assertEquals("Bush", routes.get(0).get(0));
        Assert.assertEquals("Turk", routes.get(0).get(1));
        Assert.assertEquals("Geary", routes.get(0).get(2));
        Assert.assertEquals("Polk", routes.get(0).get(3));
        Assert.assertEquals("Market", routes.get(0).get(4));

    }
}
