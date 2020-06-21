package io.aburke.data_structures;

public class Main {

    public static void main(String[] args) {
        var array = new Array(5);
        array.insert(10);
        array.insert(700);
        array.insert(30);
        array.insert(60);
        array.insert(50);

        System.out.println(array.max());
        array.removeAt(1);
        System.out.println(array.max());
    }
}
