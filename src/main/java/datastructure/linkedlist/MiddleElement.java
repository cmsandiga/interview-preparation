package datastructure.linkedlist;

/**
 * Created by makoto on 21/02/17.
 */
public class MiddleElement {


    public int findMiddleElementWithTwoPointers(Node node) {

        Node slow = node;
        Node fast = node;

        while (slow != null && fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

        }

        return slow.data;
    }

    public int findMiddleElement(Node node) {

        if (node.next == null) {
            return node.data;
        }

        int c = getCount(node);

        int middle = c / 2;

        Node it = node;
        int i = 0;

        while (i < middle) {
            it = it.next;
            i++;
        }

        return it.data;
    }

    public int getCount(Node node) {
        Node it = node;
        int c = 0;

        while (it != null) {
            c++;
            it = it.next;
        }
        return c;
    }

}
