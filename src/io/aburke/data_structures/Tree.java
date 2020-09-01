package io.aburke.data_structures;

public class Tree {
    private class Node {
        int value;
        Node leftChild;
        Node rightChild;

        Node(int value) {
            this.value = value;
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

        Node current = root;
        while (current != null) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    return;
                }
                current = current.leftChild;
            }

            if (value > current.value) {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    return;
                }

                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        return false;
    }

    public int delete(int value) {
        return -1;
    }
}