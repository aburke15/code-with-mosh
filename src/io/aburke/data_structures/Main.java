package io.aburke.data_structures;

public class Main {
    public static void main(String[] args) {
        HashTableExercises exer = new HashTableExercises();
        var result = exer.mostFrequent(new int[] { 1, 2, 2, 3, 3, 3, 4 });
        System.out.println(result);
    }
}
