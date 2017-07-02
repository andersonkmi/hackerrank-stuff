package org.coolstuff.chapter8;

public class RecursiveMultiply {

    public int multiply(int value, int times) {
        return internal_multiply(value, times);
    }

    private int internal_multiply(int value, int times) {
        if(times == 1) {
            return value;
        }
        return value + internal_multiply(value, times - 1);
    }
}
