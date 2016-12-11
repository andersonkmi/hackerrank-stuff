package org.coolstuff.codility;

import java.util.Arrays;

/**
 * Created by anderson.ito on 12/8/2016.
 */
public class MaxCounters {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] counters = new int[N];

        int maxValue = 0;

        int pos = 0;
        while(pos < A.length) {
            if(A[pos] <= N) {
                int increasedValue = increase(A[pos], counters);
                if(increasedValue > maxValue) {
                    maxValue = increasedValue;
                }
            } else {
                maxCounters(counters, maxValue);
            }
            pos++;
        }
        return counters;
    }

    private int increase(int pos, int[] counters) {
        if(pos - 1 < counters.length) {
            counters[pos - 1]++;
            return counters[pos-1];
        }
        return 0;
    }

    private void maxCounters(int[] counters, int max) {
        Arrays.fill(counters, max);
    }
}
