package datastructure.bst;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {

    @Test
    public void insert() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(4);
        binarySearchTree.insert(8);
        binarySearchTree.insert(6);
        binarySearchTree.insert(3);
        binarySearchTree.insert(1);
        binarySearchTree.insert(2);
        binarySearchTree.insert(5);
        binarySearchTree.insert(7);

        Assert.assertEquals(4, binarySearchTree.root.value);
        Assert.assertEquals(8, binarySearchTree.root.right.value);
        Assert.assertEquals(6, binarySearchTree.root.right.left.value);
        Assert.assertEquals(7, binarySearchTree.root.right.left.right.value);
        Assert.assertEquals(5, binarySearchTree.root.right.left.left.value);
        Assert.assertEquals(3, binarySearchTree.root.left.value);
        Assert.assertEquals(1, binarySearchTree.root.left.left.value);
        Assert.assertEquals(2, binarySearchTree.root.left.left.right.value);

    }

    @Test
    public void insertRecursive() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insertRecursive(4);
        binarySearchTree.insertRecursive(8);
        binarySearchTree.insertRecursive(6);
        binarySearchTree.insertRecursive(3);
        binarySearchTree.insertRecursive(1);
        binarySearchTree.insertRecursive(2);
        binarySearchTree.insertRecursive(5);
        binarySearchTree.insertRecursive(7);

        Assert.assertEquals(4, binarySearchTree.root.value);
        Assert.assertEquals(8, binarySearchTree.root.right.value);
        Assert.assertEquals(6, binarySearchTree.root.right.left.value);
        Assert.assertEquals(7, binarySearchTree.root.right.left.right.value);
        Assert.assertEquals(5, binarySearchTree.root.right.left.left.value);
        Assert.assertEquals(3, binarySearchTree.root.left.value);
        Assert.assertEquals(1, binarySearchTree.root.left.left.value);
        Assert.assertEquals(2, binarySearchTree.root.left.left.right.value);

    }

    @Test
    public void search() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(4);
        binarySearchTree.insert(8);
        binarySearchTree.insert(6);
        binarySearchTree.insert(3);
        binarySearchTree.insert(1);
        binarySearchTree.insert(2);
        binarySearchTree.insert(5);
        binarySearchTree.insert(7);

        Assert.assertEquals(4, binarySearchTree.search(4).value);
        Assert.assertEquals(7, binarySearchTree.search(7).value);
        Assert.assertEquals(5, binarySearchTree.search(5).value);
        Assert.assertEquals(3, binarySearchTree.search(3).value);
        Assert.assertEquals(8, binarySearchTree.search(8).value);
    }

    @Test
    public void searchRecursive() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(4);
        binarySearchTree.insert(8);
        binarySearchTree.insert(6);
        binarySearchTree.insert(3);
        binarySearchTree.insert(1);
        binarySearchTree.insert(2);
        binarySearchTree.insert(5);
        binarySearchTree.insert(7);

        Assert.assertEquals(4, binarySearchTree.searchRecursive(4).value);
        Assert.assertEquals(7, binarySearchTree.searchRecursive(7).value);
        Assert.assertEquals(5, binarySearchTree.searchRecursive(5).value);
        Assert.assertEquals(3, binarySearchTree.searchRecursive(3).value);
        Assert.assertEquals(8, binarySearchTree.searchRecursive(8).value);
    }

    @Test
    public void findMinimum() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(4);
        binarySearchTree.insert(8);
        binarySearchTree.insert(6);
        binarySearchTree.insert(3);
        binarySearchTree.insert(1);
        binarySearchTree.insert(2);
        binarySearchTree.insert(5);
        binarySearchTree.insert(7);

        Assert.assertEquals(1, binarySearchTree.findMinimum().value);
        binarySearchTree.insert(0);
        Assert.assertEquals(0, binarySearchTree.findMinimum().value);
    }

    @Test
    public void findMinimumRecursive() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(4);
        binarySearchTree.insert(8);
        binarySearchTree.insert(6);
        binarySearchTree.insert(3);
        binarySearchTree.insert(1);
        binarySearchTree.insert(2);
        binarySearchTree.insert(5);
        binarySearchTree.insert(7);

        Assert.assertEquals(1, binarySearchTree.findMinimumRecursive().value);
        binarySearchTree.insert(0);
        Assert.assertEquals(0, binarySearchTree.findMinimumRecursive().value);
    }
}