package io.aburke.data_structures;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        var arr = list.toArray();
        var str = Arrays.toString(arr);
        System.out.println(str);
    }
}
