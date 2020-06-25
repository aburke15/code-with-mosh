package io.aburke.data_structures;

import java.util.NoSuchElementException;

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

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (hasOneElement()) {
            first = last = null;
            return;
        }

        Node oldFirst = first;
        first = first.next;
        oldFirst.next = oldFirst = null;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (hasOneElement()) {
            first = last = null;
            return;
        }

        Node previous = getPrevious(last);
        last = previous;
        last.next = null;
    }

    public boolean contains(int item) {
        return indexOf(item) > -1;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }

        return null;
    }

    private boolean hasOneElement() {
        return first == last;
    }

    private void addFirstAndLast(int item) {
        Node node = new Node(item);
        first = last = node;
    }

    private boolean isEmpty() {
        return first == null || last == null;
    }
}
