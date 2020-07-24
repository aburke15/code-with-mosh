package io.aburke.data_structures;

public class Main {
    public static void main(String[] args) {
        var table = new HashTable();

        table.put(10, "Hello");
        table.put(5, "World");
        table.put(8, "What's Good");
        table.put(10, "YoYo");
        table.put(263, "HeyOOOooo");
    }
}
