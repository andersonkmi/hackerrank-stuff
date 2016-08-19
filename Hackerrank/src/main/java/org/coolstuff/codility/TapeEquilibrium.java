package org.coolstuff.codility;

/**
 * Created by andersonkmi on 8/19/2016.
 */
public class TapeEquilibrium {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int rightSide = 0;
        for(int i = 1; i < A.length; i++) {
            rightSide += A[i];
        }

        int leftSide = A[0];
        int result = Math.abs(leftSide - rightSide);

        for(int i = 1; i < A.length; i++) {
            if(Math.abs(leftSide - rightSide) < result) {
                result = Math.abs(leftSide - rightSide);
            }

            leftSide += A[i];
            rightSide -= A[i];
        }
        return result;
    }
}
