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
        list.addFirst(5);

        System.out.println(list.toString());
        System.out.println(list.indexOf(30));
        System.out.println(list.contains(40));
    }
}
