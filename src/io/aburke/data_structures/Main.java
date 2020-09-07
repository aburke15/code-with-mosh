package io.aburke.data_structures;

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

        // bst.traversePostOrder();
        System.out.println(bst.height());
    }

    public static int factorial(int n) {
        if (n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    // public static int factorial(int n) {
    // if (n == 1)
    // return 1;

    // int result = 1;
    // for (var i = n; i > 0; i--) {
    // result *= i;
    // }

    // return result;
    // }
}
