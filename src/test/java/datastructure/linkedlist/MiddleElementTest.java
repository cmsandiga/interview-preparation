package datastructure.linkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by makoto on 21/02/17.
 */
public class MiddleElementTest {

    @Test
    public void test(){
        Node node = new Node();
        node.data = 1;
        node.next = new Node();
        node.next.data = 2;
        node.next.next = new Node();
        node.next.next.data = 3;
        Assert.assertEquals(2,new MiddleElement().findMiddleElement(node));
        Assert.assertEquals(2,new MiddleElement().findMiddleElementWithTwoPointers(node));
    }

    @Test
    public void testWithFourElements(){
        Node node = new Node();
        node.data = 1;
        node.next = new Node();
        node.next.data = 2;
        node.next.next = new Node();
        node.next.next.data = 3;
        node.next.next.next = new Node();
        node.next.next.next.data = 4;
        Assert.assertEquals(3,new MiddleElement().findMiddleElement(node));
        Assert.assertEquals(3,new MiddleElement().findMiddleElementWithTwoPointers(node));
    }
}
