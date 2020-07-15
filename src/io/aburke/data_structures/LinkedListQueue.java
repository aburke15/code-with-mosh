package io.aburke.data_structures;

public class LinkedListQueue {
    private class Node {
        private int item;
        private Node next;
        public Node(int item) {
            this.item = item;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public LinkedListQueue() {
        this.size = 0;
    }

    // all operations are O(n)
    public void enqueue(int item) {
        Node node = new Node(item);

        if (first == null) {
            first = last = node;
            size++;
            return;
        }

        last.next = node;
        last = node;
        size++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        var node = first;
        first = first.next;
        node.next = null;
        size--;

        if (size == 0)
            first = last = null;       
        
        return node.item;
    }

    public int peek() {
        return first.item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}