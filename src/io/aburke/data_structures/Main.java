package io.aburke.data_structures;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var arr = new DynamicArray<Integer>();
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.reverse();
        var list = new LinkedList();
        // list.addFirst(30);
        // list.addFirst(20);
        // list.addFirst(10);

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        System.out.println(list.size());
        list.removeLast();
        System.out.println(list.size());
        list.removeLast();
        System.out.println(list.size());
        list.removeLast();
        System.out.println(list.size());
    }
}
