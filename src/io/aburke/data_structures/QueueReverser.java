package io.aburke.data_structures;

import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
    public void reverse(Queue<Integer> queue) {
        var stack = new Stack<Integer>();
        while (queue.isEmpty() == false)
            stack.push(queue.remove());
        
        while (stack.isEmpty() == false)
            queue.add(stack.pop());
    }
}