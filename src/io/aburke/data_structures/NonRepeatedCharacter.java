package io.aburke.data_structures;

import java.util.HashMap;

public class NonRepeatedCharacter {
    public char getFirstNonRepeatedChar(String input){
        if (input == null) 
            throw new IllegalArgumentException();

        var map = new HashMap<Character, Integer>(); 
        var chars = input.toLowerCase().toCharArray();

        for (var ch : chars) {    
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (var ch : chars)
            if (map.get(ch) == 1)
                return ch;
 
        return Character.MIN_VALUE;
    }
}