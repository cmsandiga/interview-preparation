package datastructure.linkedlist;

/**
 * Created by makoto on 21/02/17.
 */
public class ReverseLinkedList {

    public Node reverse(Node node) {

        Node cur = node;
        Node prev = null;
        Node next = null;

        while (cur != null ) {
            next = cur.next ;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    static class Node {
        int data;
        Node next;

        @Override
        public String toString() {
            return "BinarySearchTree{" +
                    "data=" + data + '}';
        }
    }
}


