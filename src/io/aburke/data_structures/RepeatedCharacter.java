package io.aburke.data_structures;

import java.util.HashSet;
import java.util.Set;

public class RepeatedCharacter {
    public char findFirstRepeatedCharacter(String input) {
        Set<Character> set = new HashSet<>();
        for (var ch : input.toCharArray()) {
            if (set.contains(ch))
                return ch;
            set.add(ch);
        }

        return Character.MIN_VALUE;
    }
}