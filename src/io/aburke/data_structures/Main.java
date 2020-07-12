package io.aburke.data_structures;

import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        var queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println(queue.toString());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.dequeue();

        System.out.println(queue.toString());
    }
}
