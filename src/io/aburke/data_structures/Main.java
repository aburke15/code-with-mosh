package io.aburke.data_structures;

public class Main {
    public static void main(String[] args) {
        HashTableExercises exer = new HashTableExercises();
        var result = exer.countPairsWithDifference(new int[] { 1, 7, 5, 9, 2, 12, 3 }, 2);
        System.out.println(result);
    }
}
