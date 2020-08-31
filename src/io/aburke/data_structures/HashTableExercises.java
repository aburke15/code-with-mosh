package io.aburke.data_structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        Map<Integer, String> map = new HashMap<>();
        var count = 0;

        for (var i : nums)
            map.put(i, "");

        for (var i : nums) {
            if ((map.get(i + k) != null))
                count++;
        }

        return count;
    }

    public int[] twoSum(int[] nums, int target) {
        if (nums == null)
            throw new IllegalArgumentException();

        HashMap<Integer, String> map = new HashMap<>();

        for (var i : nums)
            map.put(i, "");

        List<Integer> output = new ArrayList<>();
        for (var i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null)
                output.add(i);
        }
        // revist this and change this is returned
        return new int[] { output.remove(0), output.remove(0) };
    }
}