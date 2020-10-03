package io.aburke.data_structures;

import java.util.ArrayList;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        Node(int value) {
            this.value = value;
        }

        public String toString() {
            return "Node=" + value;
        }
    }

    private Node root;
    private int size;

    public Tree() {
        size = 0;
    }

    public void swapRoot() {
        var temp = root.leftChild;
        root.leftChild = root.rightChild;
        root.rightChild = temp;
    }

    public void levelOrderTraversal() {
        levelOrderTraversal(root);
    }

    private void levelOrderTraversal(Node root) {
        if (root == null) return;

        System.out.println(root.value);

        levelOrderTraversal(root.leftChild);
        levelOrderTraversal(root.rightChild);
    }

    public ArrayList<Integer> getNodesAtDistance(int k) {
        var list = new ArrayList<Integer>();
        getNodesAtDistance(root, k, list);

        return list;
    }

    private void getNodesAtDistance(Node node, int k, ArrayList<Integer> list) {
        if (node == null) return;

        if (k == 0) {
            list.add(node.value);
            return;
        }

        getNodesAtDistance(node.leftChild, k - 1, list);
        getNodesAtDistance(node.rightChild, k - 1, list);
    }

    public boolean isBinarySearchTree() {
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(Node node, int min, int max) {
        if (node == null)
            return true;

        if (min < node.value && node.value < max) {
            return isBinarySearchTree(node.leftChild, min, node.value)
                    && isBinarySearchTree(node.rightChild, node.value, max);
        }

        return false;
    }

    public boolean equals(Tree other) {
        if (other == null)
            return false;

        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null)
            return true;

        if (first != null && second != null) {
            return first.value == second.value && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);
        }

        return false;
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null)
            return -1;

        if (isLeaf(root))
            return 0;

        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    public int minBT() {
        return minBT(root);
    }

    private int minBT(Node node) {
        if (isLeaf(node))
            return node.value;

        var left = minBT(node.leftChild);
        var right = minBT(node.rightChild);

        return Math.min(node.value, Math.min(left, right));
    }

    private boolean isLeaf(Node node) {
        return node.leftChild == null && node.rightChild == null;
    }

    public int minIterative() {
        return minIterative(root);
    }

    private int minIterative(Node node) {
        if (node == null)
            throw new IllegalStateException();

        var last = node;
        while (last.leftChild != null) {
            last = last.leftChild;
        }

        return last.value;
    }

    public int minBST() {
        return minBST(root);
    }

    private int minBST(Node node) {
        if (node == null)
            throw new IllegalStateException();

        if (node.leftChild == null)
            return node.value;

        return minBST(node.leftChild);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        if (root == null)
            return;

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);

        System.out.println(root.value);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        if (root == null)
            return;

        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        if (root == null)
            return;

        System.out.println(root.value);

        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void insert(int value) {
        Node node = new Node(value);

        if (root == null) {
            root = node;
            size++;
            return;
        }

        var current = root;
        while (current != null) {
            if (current.value == value)
                return;

            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    size++;
                    return;
                }

                current = current.leftChild;
            }

            if (value > current.value) {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    size++;
                    return;
                }

                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (current.value == value)
                return true;
            if (value < current.value)
                current = current.leftChild;
            if (value > current.value)
                current = current.rightChild;
        }

        return false;
    }

    public int delete(int value) {
        return -1;
    }

    public int size() {
        return size;
    }
}