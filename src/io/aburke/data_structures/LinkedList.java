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
        var node = new Node(item);
        
        if (isEmpty()) {
            addFirstAndLast(item);
            return;
        }

        node.next = first;
        first = node;
    }

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            addFirstAndLast(item);
            return;
        }

        last.next = node;
        last = node;
    }

    public int indexOf(int item) { 
        var index = 0;
        for (var x = first; x != null; x = x.next) {
            if (x.item == item) return index;
            index++;
        }

        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) > -1;
    }

    private void addFirstAndLast(int item) {
        Node node = new Node(item);
        first = last = node;
    }

    private boolean isEmpty() {
        return (first == null || last == null);
    }
}
