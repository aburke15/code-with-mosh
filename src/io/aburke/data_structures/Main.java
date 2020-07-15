package io.aburke.data_structures;


public class Main {

    public static void main(String[] args) {
        var queue = new LinkedListQueue();

        queue.enqueue(1);
        queue.enqueue(5);
        queue.enqueue(3);

        var peek = queue.peek();
        var dequeue = queue.dequeue();
        System.out.println(peek);
        System.out.println(dequeue);
    }
}
