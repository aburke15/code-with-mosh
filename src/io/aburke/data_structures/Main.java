package io.aburke.data_structures;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var array = new Array(3);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);

        array.insertAt(22, 2);
        array.insertAt(45, 5);

        array.print();
        System.out.println();
    }
}
