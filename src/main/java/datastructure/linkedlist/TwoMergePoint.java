package datastructure.linkedlist;

/**
 * Created by makoto on 21/02/17.
 */
public class TwoMergePoint {


    public int twoMergePoint(Node nodeA, Node nodeB) {

        int ca = getCount(nodeA);
        int cb = getCount(nodeB);

        if (ca > cb) {
            return getElement(ca - cb, nodeA, nodeB);
        } else {
            return getElement(cb - ca, nodeB, nodeA);
        }

    }

    public int getElement(int d, Node nodeA, Node nodeB) {


        int i = 0;

        while (i < d) {
            nodeA = nodeA.next;
            i++;
        }

        while (nodeA != null && nodeB != null) {

            if (nodeA == nodeB) {
                return nodeA.data;
            }

            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }

        return -1;
    }

    int getCount(Node node) {

        Node it = node;
        int c = 0;

        while (it != null) {
            c++;
            it = it.next;
        }

        return c;
    }
}
