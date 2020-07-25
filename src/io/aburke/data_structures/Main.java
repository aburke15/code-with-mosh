package io.aburke.data_structures;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var table = new HashTable(10);

        table.put(10, "Hello");
        table.put(5, "World");
        table.put(8, "What's Good");
        table.put(10, "YoYo"); 
        table.put(263, "HeyOOOooo");
        table.put(100, "It's a meeeee!");

        System.out.println(table.get(10));

        Map<Integer, String> map = new HashMap<>();
    }
}
