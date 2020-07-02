package io.aburke.data_structures;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        var expression = "1 + <1>";
        var balancer = new BalancedExpressions();

        System.out.println(balancer.IsBalanced(expression));
    }
}
