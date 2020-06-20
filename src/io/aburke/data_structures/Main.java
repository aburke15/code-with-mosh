package io.aburke.data_structures;

public class Main {

    public static void main(String[] args) {
        var array = new Array(5);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.removeAt(1);
        array.print();
        System.out.println(array.indexOf(90));
    }
}
