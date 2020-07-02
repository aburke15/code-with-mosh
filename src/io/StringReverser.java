package io;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input) {
        if (input == null)
            throw new IllegalArgumentException();

        var stack = new Stack<Character>();
        for (var ch : input.toCharArray())
            stack.push(ch);

        var reversed = new StringBuffer();
        while (stack.empty() == false)
            reversed.append(stack.pop());
        
        return reversed.toString();
    }
}