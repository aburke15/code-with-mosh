package io.aburke.data_structures;

public class Main {
    public static void main(String[] args) {
        HashTableLP table = new HashTableLP(5);

        table.put(0, "zero");
        table.put(2, "two");
        table.put(2, "2");
        table.put(3, "three");
        table.put(4, "four");
        table.put(7, "seven");

        var item1 = table.get(4);
        var item2 = table.remove(7);
        var item3 = table.get(17);
        var item4 = table.remove(19);

        System.out.println(item1);
        System.out.println(item2);
        System.out.println(table.size());
        System.out.println(item3);
        System.out.println(item4);
    }
}
