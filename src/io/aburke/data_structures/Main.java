package io.aburke.data_structures;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tree bst = new Tree();

        bst.insert(7);
        bst.insert(4);
        bst.insert(9);
        bst.insert(1);
        bst.insert(6);
        bst.insert(8);
        bst.insert(10);
        bst.insert(0);
        bst.insert(3);

        bst.levelOrderTraversal();
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
