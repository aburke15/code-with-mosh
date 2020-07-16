package io.aburke.data_structures;

public class Main {
    public static void main(String[] args) {
        StackWithTwoQueues stack = new StackWithTwoQueues();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        var pop1 = stack.pop();
        var peek1 = stack.peek();

        stack.push(40);
        stack.push(50);

        var pop2 = stack.pop();
        var pop3 = stack.pop();
        var pop4 = stack.pop();

        System.out.println(pop1);
        System.out.println(peek1);
    }
}
