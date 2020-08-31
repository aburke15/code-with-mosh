package io.aburke.data_structures;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HashTableExercises exer = new HashTableExercises();

        var res = exer.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        System.out.println(Arrays.toString(res));
    }
}
