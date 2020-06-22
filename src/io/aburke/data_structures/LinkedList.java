package io.aburke.data_structures;

public class LinkedList {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void addFirst(int item) {
        Node node = new Node(item);
        
        if (first == null) {
            first = node;
            last = node;
            
            return;
        }

        Node oldFirst = first;
        first = node;
        first.next = oldFirst;
    }

    public void addLast(int item) {

    }
}
