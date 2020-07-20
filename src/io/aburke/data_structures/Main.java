package io.aburke.data_structures;

public class Main {
    public static void main(String[] args) {
        NonRepeatedCharacter nrc = new NonRepeatedCharacter();

        var res = nrc.getFirstNonRepeatedChar("a green apple");
        System.out.println(res);
    }
}
