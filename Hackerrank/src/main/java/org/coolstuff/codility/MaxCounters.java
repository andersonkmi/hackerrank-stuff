package org.coolstuff.codility;

/**
 * Created by anderson.ito on 12/8/2016.
 */
public class MaxCounters {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] counters = new int[N];

        int maxValue = 0;

        for(int pos = 0; pos < A.length; pos++) {
            if(A[pos] <= N) {
                int increasedValue = increase(A[pos], counters);
                if(increasedValue > maxValue) {
                    maxValue = increasedValue;
                }
            } else {
                maxCounters(counters, maxValue);
            }
        }
        return counters;
    }

    private int increase(int pos, int[] counters) {
        int position = pos - 1;
        if(position < counters.length) {
            counters[position] = counters[position] + 1;
            return counters[position];
        }
        return 0;
    }

    private void maxCounters(int[] counters, int max) {
        for(int index = 0; index < counters.length; index++) {
            counters[index] = max;
        }
    }
}
