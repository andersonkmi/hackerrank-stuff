package org.coolstuff.codility;

import java.util.Arrays;

/**
 * Created by andersonkmi on 9/4/2016.
 */
public class PermCheck {
    public int solution(int[] A) {
        int previous = 0;
        Arrays.sort(A);
        for(int i : A) {
            if(++previous != i) {
                return 0;
            }
        }
        return 1;
    }
}
