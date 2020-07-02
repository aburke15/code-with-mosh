package io.aburke.data_structures;

import java.util.HashMap;
import java.util.Stack;

public class BalancedExpressions {
    private final HashMap<Character, Character> map;

    public BalancedExpressions() {
        map = new HashMap<Character, Character>();

        map.put('(', ')');
        map.put('{', '}');
        map.put('<', '>');
        map.put('[', ']');
    }
    
    public boolean IsBalanced(String expression) {
        if (expression == null)
            throw new IllegalStateException();
        
        var stack = new Stack<Character>();
        for (var ch : expression.toCharArray()) {
            if (map.containsKey(ch))
                stack.push(ch);

            if (map.containsValue(ch)) {
                if (stack.empty())
                    return false;

                var rightBracket = map.get(stack.pop());

                if (rightBracket != ch)
                    return false;
            }
        }

        if (stack.empty() == false)
            return false; 

        return true;
    }
}