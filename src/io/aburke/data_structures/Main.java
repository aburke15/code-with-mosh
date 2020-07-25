package io.aburke.data_structures;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var table = new HashTable(10);

        table.put(10, "First");
        table.put(20, "Middle");
        table.put(30, "Last");

        System.out.println(table.get(10));
        System.out.println(table.remove(20));

        // Map<Integer, String> map = new HashMap<>();
        // var item = map.remove(10);
    }
}
