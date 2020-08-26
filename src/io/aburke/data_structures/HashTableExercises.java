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

        return map.size();
    }

    public int[] twoSum(int[] nums, int target) {
        if (nums == null)
            throw new IllegalArgumentException();

        HashMap<Integer, Integer> map = new HashMap<>();

        // nums = [2, 7, 11, 15]
        // target = 9
        for (var num : nums) {

        }

        for (var entry : map.entrySet()) {

        }

        return new int[] { 1 };
    }
}