package io.aburke.data_structures;

public class Main {
    public static void main(String[] args) {
        var avlTree = new AvlTree();

//        avlTree.insert(7);
//        avlTree.insert(4);
//        avlTree.insert(9);
//        avlTree.insert(1);
//        avlTree.insert(6);
//        avlTree.insert(8);
//        avlTree.insert(10);
//        avlTree.insert(0);
//        avlTree.insert(2);
//        avlTree.insert(3);

        avlTree.insert(7);
        avlTree.insert(10);
        avlTree.insert(15);
        avlTree.insert(8);
    }

    public static int factorialRecursive(int n) {
        if (n == 0)
            return 1;

        return n * factorialRecursive(n - 1);
    }

    public static int factorialIterative(int n) {
        n = n == 0 ? 1 : n;
        int result = 1;
        for (var i = n; i > 0; i--) {
            result *= i;
        }

        return result;
    }
}
