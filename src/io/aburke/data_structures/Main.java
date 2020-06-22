package io.aburke.data_structures;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedList();
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);

        System.out.println(list.toString());
    }
}
