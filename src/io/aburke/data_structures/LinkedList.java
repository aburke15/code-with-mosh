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

    public int[] toArray() {
        var items = new int[size];
        var i = 0;

        for (var x = first; x != null; x = x.next)
            items[i++] = x.item;

        return items;
    }

    public void reverse() {
        if (isEmpty()) return;

        Node p = null;
        Node c = first;
        Node n = first.next;

        while (c != null) {
            c.next = p;
            p = c;
            c = n;

            if (n != null)
                n = n.next;
        }

        last = first;
        first = p;
    }

    public Node kthNodeFromEnd(int k) {
        var i = 0;
        Node p = first;
        Node c = first;

        while (c.next != null) {
            c = c.next;
            
            if (i++ >= (k - 1))
                p = p.next;
        }

        return p;
    }

    public void printMiddle() {
        if (isEmpty())
            throw new IllegalStateException();

        Node p = first;
        Node c = first;

        while (c != last && c.next != last) {
            p = p.next;
            c = c.next.next;
        }

        if (c == last) {
            System.out.println(p.item);
        } else {
            System.out.println(p.item + " " + p.next.item);
        } 
    }

    public boolean hasCycle() {
        if (isEmpty())
            throw new IllegalStateException();

        Node slow = first;
        Node fast = first;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow)
                return true;
        }

        return false;
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
