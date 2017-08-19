package org.coolstuff.candles;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BirthdayCandles {
    static long birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        List<Integer> list = IntStream.of(ar).boxed().collect(Collectors.toList());
        Collections.sort(list);
        int tallest = list.get(list.size() - 1);
        long result = list.stream().filter(p -> p == tallest).count();
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        long result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}

