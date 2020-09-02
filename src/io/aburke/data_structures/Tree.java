package io.aburke.data_structures;

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

    private Node lookup(int value) {

        return null;
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
}