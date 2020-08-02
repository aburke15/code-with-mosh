package io.aburke.data_structures;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var table = new HashTable(10);

        table.put(10, "First");
        table.put(20, "Middle");
        table.put(30, "Last");
        table.remove(20);

        table.put(11, "ai");
        table.put(7, "hi");

        System.out.println(table.get(10));

        // Map<Integer, String> map = new HashMap<>();
        // var item = map.remove(10);
    }
}
