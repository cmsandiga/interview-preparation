package datastructure.bst;

public class BinarySearchTree {

    public Node root;




    public static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value) {

        if (root == null) {
            root = new Node(value);
            return;
        }

        Node it = root;
        while (it != null) {

            if (it.value > value) {
                if (it.left != null) {
                    it = it.left;
                } else {
                    it.left = new Node(value);
                    break;
                }
            } else {
                if (it.right != null) {
                    it = it.right;
                } else {
                    it.right = new Node(value);
                    break;
                }
            }
        }
    }

    public void insertRecursive(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        insertUtil(value, root);
    }

    private void insertUtil(int value, Node root) {

        if (root == null) {
            return;
        }

        if (root.value > value) {
            if (root.left != null) {
                insertUtil(value, root.left);
            } else {
                root.left = new Node(value);
                return;
            }

        } else {
            if (root.right != null) {
                insertUtil(value, root.right);
            } else {
                root.right = new Node(value);
                return;
            }
        }
    }

    public Node search(int value) {


        Node it = root;

        while (it != null) {

            if (it.value == value) {
                return it;
            }

            if (it.value > value) {
                it = it.left;
            } else {
                it = it.right;
            }
        }

        return null;
    }

    public Node searchRecursive(int value) {
        return searchRecursiveUtil(root, value);
    }


    public Node searchRecursiveUtil(Node root, int value) {

        if (root == null) {
            return null;
        }

        if (root.value == value) {
            return root;
        }

        Node nextNode = root.value > value ? root.left : root.right;

        return searchRecursiveUtil(nextNode, value);

    }

    public Node findMinimum() {

        if (root == null) {
            return null;
        }

        Node min = null;

        Node it = root;

        while (it != null) {

            if (min == null || min.value > it.value) {
                min = it;
            } else {
                it = it.left;
            }
        }

        return min;
    }

    public Node findMinimumRecursive() {
        return findMinimumRecursiveUtil(root, null);
    }

    public Node findMinimumRecursiveUtil(Node root, Node min){

        if(root == null){
            return min;
        }
        min = root;

        return findMinimumRecursiveUtil(root.left, min);
    }
}








