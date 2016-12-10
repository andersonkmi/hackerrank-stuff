package org.coolstuff.codility;

import java.util.Arrays;
/**
 * Created by anderson.ito on 12/8/2016.
 */
public class MaxCounters {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] counters = new int[N];
        for(int pos = 0; pos < A.length; pos++) {
            if(A[pos] >= 1 && A[pos] <= N) {
                increase(A[pos], counters);
            } else if(A[pos] == N + 1) {
                maxCounters(counters);
            }
        }
        return counters;
    }

    private void increase(int pos, int[] counters) {
        int position = pos - 1;
        if(position >= 0 && position < counters.length) {
            counters[position] = counters[position] + 1;
        }

    }

    private void maxCounters(int[] counters) {
        int max = findMax(counters);
        for(int index = 0; index < counters.length; index++) {
            counters[index] = max;
        }
    }

    private int findMax(int[] counters) {
        int[] elements = Arrays.copyOf(counters, counters.length);
        Arrays.sort(elements);
        return elements[elements.length - 1];
    }
}
