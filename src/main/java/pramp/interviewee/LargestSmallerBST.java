package pramp.interviewee; /**
 * Created by makoto on 05/05/17.
 */


/***********************************************************
 * CODE INSTRUCTIONS:                                      *
 * 1) The method findLargestSmallerKey you're              *
 *    asked to implement is located at line 36.            *
 * 2) Use the helper code below to implement it.           *
 * 3) In a nutshell, the helper code allows you to         *
 *    to build a Binary Search Tree.                       *
 * 4) Jump to line 82 to see an example for how the        *
 *    helper code is used to test findLargestSmallerKey.   *
 ***********************************************************/
// Cristian
// Bishal

public class LargestSmallerBST {

    static class Node {
        int key;
        Node left;
        Node right;
        Node parent;

        Node(int key) {
            this.key = key;
            left = null;
            right = null;
            parent = null;
        }
    }

    static class BinarySearchTree {

        Node root;

        int findLargestSmallerKey(int num) {

            Node it = root;

            int minimum = -1;

            while (it != null) {
                Node right = it.right;
                Node left = it.left;

                if (right != null && right.key < num) {
                    minimum = right.key;
                    it = right;
                } else if (left != null && left.key < num) {
                    minimum = left.key;
                    it = left;
                } else {
                    break;
                }
            }
            return minimum;
        }

        //  inserts a new node with the given number in the
        //  correct place in the tree
        void insert(int key) {

            // 1) If the tree is empty, create the root
            if (this.root == null) {
                this.root = new Node(key);
                return;
            }

            // 2) Otherwise, create a node with the key
            //    and traverse down the tree to find where to
            //    to insert the new node
            Node currentNode = this.root;
            Node newNode = new Node(key);

            while (currentNode != null) {
                if (key < currentNode.key) {
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        newNode.parent = currentNode;
                        break;
                    } else {
                        currentNode = currentNode.left;
                    }
                } else {
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        newNode.parent = currentNode;
                        break;
                    } else {
                        currentNode = currentNode.right;
                    }
                }
            }
        }
    }

    /*********************************************
     * Driver program to test above function     *
     *********************************************/

    public static void main(String[] args) {

        // Create a Binary Search Tree
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(20);
        bst.insert(24);
        bst.insert(14);

        int result = bst.findLargestSmallerKey(17);
        System.out.println("Largest smaller number is " + result);

    }
}

