package io.aburke.data_structures;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tree bst = new Tree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(12);
        bst.insert(11);
        bst.insert(13);

        bst.insert(4);
        bst.insert(6);
        bst.insert(1);
        bst.insert(5); // does not get inserted

        System.out.println(bst.find(17));
    }
}
