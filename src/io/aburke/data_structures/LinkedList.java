package io.aburke.data_structures;

public class LinkedList {
    class Node {
        int item;
        Node next;

        Node(int item) {
            this.item = item;
        }
    }

    private Node first;
    private Node last;

    public void addFirst(int item) {
        Node node = new Node(item);
        
        if (firstOrLastIsNull()) {
            addFirstAndLastNode(item);
            return;
        }

        Node oldFirst = first;
        first = node;
        first.next = oldFirst;
    }

    public void addLast(int item) {
        Node node = new Node(item);

        if (firstOrLastIsNull()) {
            addFirstAndLastNode(item);
            return;
        }

        Node oldLast = last;
        last = node;
        oldLast.next = last;
    }

    private void addFirstAndLastNode(int item) {
        Node node = new Node(item);
        
        first = node;
        last = node;
    }

    private boolean firstOrLastIsNull() {
        return (first == null || last == null);
    }
}
