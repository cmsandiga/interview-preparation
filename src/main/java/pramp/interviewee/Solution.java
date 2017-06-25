package pramp.interviewee;

/**
 * Created by makoto on 14/05/17.
 */
import java.io.*;
import java.util.*;

public class Solution {

    static class Node {

        int key;
        Node[] children;
        Node parent;

        Node(int key) {
            this.key = key;
            children = null;
            parent = null;
        }
    }

    //public static final int minimum = Integer.MAX_VALUE;
    static class SalesPath {


        public static int getCheapestCost(Node rootNode) {

            if(rootNode.children == null){
                return rootNode.key;
            }

            Node[] children = rootNode.children;

            int min = Integer.MAX_VALUE;
            for(int i = 0; i < children.length; i++){
                int count = getCheapestCost(rootNode.children[i]);

                if(count < min){
                    min = count;
                }

            }
            return rootNode.key + min;
        }
        //   1 <-
        //  2   3 <-
        // 1  4

        // go to left until != null and then go to right storing the variable that is the last
        // one variable that store the minimum
        /*********************************************
         * Driver program to test above method     *
         *********************************************/

        public static void main(String[] args) {
            Node node = new Node(0);
            node.children = new Node[3];
            node.children[0].key = 5;
            node.children[1].key = 3;
            node.children[1].key = 6;

            System.out.println(Solution.SalesPath.getCheapestCost(node));
        }
    }
}
