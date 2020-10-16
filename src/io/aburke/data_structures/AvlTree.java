package io.aburke.data_structures;

public class AvlTree {
    private class AvlNode {
        private int value;
        private int height;
        private AvlNode leftChild;
        private AvlNode rightChild;

        public AvlNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Value=" + this.value + " - " + "Height=" + this.height;
        }
    }

    private int size;
    private AvlNode root;

    public AvlTree() {
        this.size = 0;
    }

    private int height(AvlNode root) {
        return root == null ? -1 : Math.max(
                height(root.leftChild),
                height(root.rightChild)) + 1;
    }

    public void insert(int value) {
        this.root = insert(this.root, value);
    }

    private AvlNode insert(AvlNode root, int value) {
        if (root == null)
            return new AvlNode(value);

        if (value < root.value)
            root.leftChild = insert(root.leftChild, value);
        else if (value > root.value)
            root.rightChild = insert(root.rightChild, value);

        root.height = height(root);

        if (balanceFactor(root) > 1)
            System.out.println(root.value);
        if (balanceFactor(root) < -1)
            System.out.println(root.value);

        return root;
    }

    private int balanceFactor(AvlNode root) {
        return height(root.leftChild) - height(root.rightChild);
    }

    private boolean isLeaf(AvlNode root) {
        return (root.leftChild == null) && (root.rightChild == null);
    }

/// My initial implementation works but it's not concise
//    public void insert(int value) {
//        var node = new AvlNode(value);
//
//        if (root == null) {
//            root = node;
//            return;
//        }
//
//        insert(root, node);
//    }
//
//    private void insert(AvlNode root, AvlNode child) {
//        var rootValue = root.value;
//        var childValue = child.value;
//
//        if (childValue < rootValue) {
//            if (root.leftChild == null) {
//                this.size++;
//                root.leftChild = child;
//                return;
//            }
//
//            insert(root.leftChild, child);
//        }
//
//        if (childValue > rootValue) {
//            if (root.rightChild == null) {
//                this.size++;
//                root.rightChild = child;
//                return;
//            }
//
//            insert(root.rightChild, child);
//        }
//    }
}
