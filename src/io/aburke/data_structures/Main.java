package io.aburke.data_structures;


public class Main {

    public static void main(String[] args) {
        var queue = new PriorityQueue();

        queue.enqueue(1);
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(7);
        queue.enqueue(2);
        queue.dequeue();
        queue.enqueue(6);
        queue.enqueue(8);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
