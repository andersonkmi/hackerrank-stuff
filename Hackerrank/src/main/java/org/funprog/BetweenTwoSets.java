package org.funprog;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {

    public int getTotalX(int[] a, int[] b) {
        int result = 0;
        List<Integer> firstCondOK = new ArrayList<>();

        // Verifies first condition
        for(int index = 0; index < a.length; index++) {
            boolean isOK = true;
            for(int index2 = 0; index2 < a.length && isOK; index2++) {
                if(a[index] % a[index2] != 0) {
                    isOK = false;
                }
            }

            if(isOK) {
                firstCondOK.add(a[index]);
            }
        }

        // Verifies second condition
        
        return result;
    }
}
