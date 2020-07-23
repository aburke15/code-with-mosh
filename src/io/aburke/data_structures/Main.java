package io.aburke.data_structures;

public class Main {
    public static void main(String[] args) {
        RepeatedCharacter rc = new RepeatedCharacter();

        var res = rc.findFirstRepeatedCharacter("a green apple");
        System.out.println(res);
    }
}
