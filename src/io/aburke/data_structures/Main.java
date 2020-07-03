package io.aburke.data_structures;

public class Main {

    public static void main(String[] args) {
        var stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.size());

        var item1 = stack.pop();
        var peek1 = stack.peek();
        var item2 = stack.pop();
        var item3 = stack.pop();

        System.out.println(stack.isEmpty());

        System.out.println(stack.size());
    }
}
