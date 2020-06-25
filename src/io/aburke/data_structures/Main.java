package io.aburke.data_structures;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedList();
        // list.addFirst(30);
        // list.addFirst(20);
        // list.addFirst(10);

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
    }
}
