package io.aburke.data_structures;

public class AvlTree {
    private class AvlNode {
        private int value;
        private int height;
        private int depth;
        private AvlNode leftChild;
        private AvlNode rightChild;

        public AvlNode(int value) {
            this.value = value;
            this.depth = 0;
        }

        @Override
        public String toString() {
            return "Value=" + this.value + " - "
                    + "Height=" + this.height;
        }
    }

    private int size;
    private AvlNode root;

    public AvlTree() {
        this.size = 0;
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

        setHeight(root);

        return balance(root);
    }

    private AvlNode rotateLeft(AvlNode root) {
        var newRoot = root.rightChild;

        root.rightChild = newRoot.leftChild;
        newRoot.leftChild = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private AvlNode rotateRight(AvlNode root) {
        var newRoot = root.leftChild;

        root.leftChild = newRoot.rightChild;
        newRoot.rightChild = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private void setHeight(AvlNode node) {
        node.height = Math.max(
                height(node.leftChild),
                height(node.rightChild)) + 1;
    }

    private AvlNode balance(AvlNode root) {
        if (isLeftHeavy(root)) {
            if (balanceFactor(root.leftChild) < 0)
                root.leftChild = rotateLeft(root.leftChild);

            return rotateRight(root);
        } else if (isRightHeavy(root)) {
            if (balanceFactor(root.rightChild) > 0)
                root.rightChild = rotateRight(root.rightChild);

            return rotateLeft(root);
        }

        return root;
    }

    private boolean isLeftHeavy(AvlNode root) {
        return balanceFactor(root) > 1;
    }

    private boolean isRightHeavy(AvlNode root) {
        return balanceFactor(root) < -1;
    }

    private int depth(AvlNode root) {
        if (root == null) return 0;

        root.depth += 1;

        return root.depth = Math.max(
                depth(root.leftChild),
                depth(root.rightChild));
    }

    private int balanceFactor(AvlNode root) {
        return root == null ? 0 : height(root.leftChild) - height(root.rightChild);
    }

    private int height(AvlNode root) {
        return root == null ? -1 : Math.max(
                height(root.leftChild),
                height(root.rightChild)) + 1;
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
