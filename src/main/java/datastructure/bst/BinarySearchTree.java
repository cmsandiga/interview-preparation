package datastructure.bst;

import java.util.*;

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

    public Node findMinimumRecursiveUtil(Node root, Node min) {

        if (root == null) {
            return min;
        }
        min = root;

        return findMinimumRecursiveUtil(root.left, min);
    }


    public int sum() {
        return sumUtil(root);
    }

    public int sumUtil(Node root) {

        if (root == null) {
            return 0;
        }

        int left = sumUtil(root.left);
        int right = sumUtil(root.right);

        return left + right + root.value;
    }

    public int sumBFS() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int sum = 0;

        while (!queue.isEmpty()) {
            Node it = queue.peek();
            sum += it.value;

            if (it.left != null) queue.offer(it.left);
            if (it.right != null) queue.offer(it.right);
        }

        return sum;
    }

    public List<Integer> bfs() {
        List<Integer> result = new ArrayList<>();

        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            result.add(node.value);

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }

        return result;
    }


    public int height(Node root) {
        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    public void inOrderRecursive(Node root, List<Integer> result) {

        if (root == null)
            return;

        inOrderRecursive(root.left, result);
        result.add(root.value);
        inOrderRecursive(root.right, result);
    }

    public void inOrderIterative(Node root, List<Integer> result) {

        if (root == null)
            return;

        Stack<Node> stack = new Stack<>();

        Node it = root;
        //stack.push(it);

        while (it != null) {
            stack.push (it);

            if (it.left != null) {
                it = it.left;
                continue;
            } else {
                result.add(stack.pop().value);
            }

            if (it.right != null) {
                it = it.right;
            } else {
                if (!stack.isEmpty()) {
                    it = stack.peek().right;
                    result.add(stack.pop().value);
                } else {
                    break;
                }
            }
        }

    }
}