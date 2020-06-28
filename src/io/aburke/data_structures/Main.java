package io.aburke.data_structures;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        var node = list.kthNodeFromEnd(3);

        list.addFirst(5);
    }
}
