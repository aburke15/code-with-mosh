package io.aburke.data_structures;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var arr = new DynamicArray<Integer>();
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.insert(50);
        arr.insert(60);
        System.out.println(arr.indexOf(20));
        System.out.println(arr.contains(40));
        System.out.println(arr.contains(70));
    }
}
