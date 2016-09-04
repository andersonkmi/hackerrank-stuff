package org.coolstuff.codility;

/**
 * Created by andersonkmi on 9/4/2016.
 */
public class Solution1 {
    public int solution(int X, int[] A) {
        int result = 0;
        for(int k = 0; k < A.length; k++) {
            int equals = 0;
            int diff = 0;
            int i = 0;

            while(i < k) {
                if(A[i] == X) {
                    equals++;
                }
                i++;
            }

            int j = k;
            while(j < A.length) {
                if(A[j] != X) {
                    diff++;
                }
                j++;
            }

            if(equals == diff) {
                result = k;
                break;
            }
        }
        return result;
    }
}
