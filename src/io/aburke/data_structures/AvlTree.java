package io.aburke.data_structures;

public class AvlTree {
    private class AvlNode {
        int value;
        AvlNode leftChild;
        AvlNode rightChild;

        public AvlNode(int value) {
            this.value = value;
        }
    }

    private int size;
    private AvlNode root;

    public AvlTree() {
        this.size = 0;
    }

    public void insert(int value) {
        var node = new AvlNode(value);

        if (root == null) {
            root = node;
            return;
        }

        insert(root, node);
    }

    private void insert(AvlNode root, AvlNode child) {
        var rootValue = root.value;
        var childValue = child.value;

        if (childValue < rootValue) {
            if (root.leftChild == null) {
                root.leftChild = child;
                return;
            }

            insert(root.leftChild, child);
        }

        if (childValue > rootValue) {
            if (root.rightChild == null) {
                root.rightChild = child;
                return;
            }

            insert(root.rightChild, child);
        }

    }
}
