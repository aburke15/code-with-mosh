package io.aburke.data_structures;

import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        var queue = new ArrayDeque<Integer>();
        var reverser = new QueueReverser();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue);

        reverser.reverse(queue);
        System.out.println(queue);
    }
}
