package datastructure.linkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by makoto on 21/02/17.
 */
public class TwoMergePointTest {

    @Test
    public void test() {

        Node nodeA = new Node();
        nodeA.data = 3;
        nodeA.next = new Node();
        nodeA.next.data = 6;
        nodeA.next.next = new Node();
        nodeA.next.next.data = 9;

        Node nodeB = new Node();
        nodeB.data = 10;


        Node nodeI = new Node();
        nodeI.data = 15;
        nodeI.next = new Node();
        nodeI.next.data = 30;

        nodeA.next.next.next = nodeI;
        nodeB.next = nodeI;

        int result = new TwoMergePoint().twoMergePoint(nodeA, nodeB);

        Assert.assertEquals(15, result);
    }

    @Test
    public void testWhenNoCrossPath() {

        Node nodeA = new Node();
        nodeA.data = 3;
        nodeA.next = new Node();
        nodeA.next.data = 6;
        nodeA.next.next = new Node();
        nodeA.next.next.data = 9;

        Node nodeB = new Node();
        nodeB.data = 10;

        int i = new TwoMergePoint().twoMergePoint(nodeA, nodeB);
        int result = i;

        Assert.assertEquals(-1, result);
    }
}
