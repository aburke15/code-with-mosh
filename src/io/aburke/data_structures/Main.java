package io.aburke.data_structures;


public class Main {

    public static void main(String[] args) {
        var queue = new PriorityQueue();

        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(7);
        queue.enqueue(2);
    }
}
