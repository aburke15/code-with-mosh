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
    private int size = 0;

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            addFirstAndLast(node);
            return;
        }

        node.next = first;
        first = node;
        size++;
    }

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            addFirstAndLast(node);
            return;
        }

        last.next = node;
        last = node;
        size++;
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
            removeFirstAndLast();
            return;
        }

        Node oldFirst = first;
        first = first.next;
        oldFirst.next = oldFirst = null;
        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (hasOneElement()) {
            removeFirstAndLast();
            return;
        }

        Node previous = getPrevious(last);
        last = previous;
        last.next = null;
        size--;
    }

    public int size() {
        return size;
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

    private void removeFirstAndLast() {
        first = last = null;
        size--;
    }

    private void addFirstAndLast(Node node) {
        first = last = node;
        size++;
    }

    private boolean isEmpty() {
        return first == null || last == null;
    }
}
