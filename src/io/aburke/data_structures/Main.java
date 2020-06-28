package io.aburke.data_structures;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        list.reverse();
        var arr = list.toArray();
        var str = Arrays.toString(arr);
        System.out.println(str);

        list.addFirst(5);
    }
}
