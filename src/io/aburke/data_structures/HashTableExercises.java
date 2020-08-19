package io.aburke.data_structures;

import java.util.HashMap;

public class HashTableExercises {
    public int mostFrequent(int[] nums) {
        if (nums == null)
            throw new IllegalArgumentException();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (var num : nums) {
            var count = map.containsKey(num) ? map.get(num) : 0;
            map.put(num, count + 1);
        }

        int count = Integer.MIN_VALUE;
        int mostRepeated = -1;

        for (var item : map.entrySet()) {
            if (item.getValue() > count) {
                count = item.getValue();
                mostRepeated = item.getKey();
            }
        }

        return mostRepeated;
    }
}