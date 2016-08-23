package org.coolstuff.codility;

import java.util.Arrays;

/**
 * Created by anderson.ito on 23/08/2016.
 */
public class PermMissingElem {
    public int solution(int[] array) {
        if(array.length == 0) {
            return 1;
        }

        Arrays.sort(array);

        int missing = -1;
        int i = 0;
        while(i < array.length) {

            if(array[i] != i + 1) {
                missing = i + 1;
                break;
            }
            i++;
        }
        return missing;
    }
}
