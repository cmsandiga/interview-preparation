package datastructure.linkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by makoto on 21/02/17.
 */
public class ReverseLinkedListTest {

    @Test
    public void reverse() {
        ReverseLinkedList.Node node = new ReverseLinkedList.Node();
        node.data = 4;
        node.next = new ReverseLinkedList.Node();
        node.next.data = 5;
        node.next.next = new ReverseLinkedList.Node();
        node.next.next.data = 3;

        node = new ReverseLinkedList().reverse(node);


        Assert.assertEquals(3, node.data);
        Assert.assertEquals(5, node.next.data);
        Assert.assertEquals(4, node.next.next.data);
    }
}
