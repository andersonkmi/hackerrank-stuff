package org.funprog;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(2);

        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Teste: " + integer);
            }
        });
    }
}
