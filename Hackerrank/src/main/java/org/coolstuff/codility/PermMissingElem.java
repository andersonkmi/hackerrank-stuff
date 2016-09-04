package org.coolstuff.codility;

import java.util.Arrays;

/**
 * Created by anderson.ito on 23/08/2016.
 */
public class PermMissingElem {
    public int solution(int[] A) {
        int previous = 0;
        if (A.length != 0) {
            Arrays.sort(A);
            for (int i : A) {
                if (++previous != i) {
                    return previous;
                }
            }
        }
        return ++previous;
    }
}
