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

        for (var entry : map.entrySet()) {
            if (entry.getValue() > count) {
                count = entry.getValue();
                mostRepeated = entry.getKey();
            }
        }

        return mostRepeated;
    }

    public int countPairsWithDifference(int[] nums, int k) {
        if (nums == null)
            throw new IllegalArgumentException();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                int a = nums[i];
                int b = nums[j];

                if (a < b && (b - a == k))
                    map.put(a, b);
                else if (b < a && (a - b == k))
                    map.put(b, a);
            }
        }

        return map.size();
    }
}