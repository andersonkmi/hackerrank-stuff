package org.coolstuff.codility;

/**
 * Created by andersonkmi on 8/7/2016.
 */
public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        if(A.length == 0) {
            return A;
        }
        // write your code in Java SE 8
        for(int times = 0; times < K; times++) {
            singleRotation(A);
        }

        return A;
    }

    private void singleRotation(int[] numbers) {
        int lastItem = numbers[numbers.length - 1];

        for(int index = numbers.length - 1; index > 0; index--) {
            numbers[index] = numbers[index - 1];
        }

        numbers[0] = lastItem;
    }
}
