package org.coolstuff.codility;

import java.util.*;

/**
 * Created by andersonkmi on 8/7/2016.
 */
public class OddOccurencesInArray {
    public int solution(int[] A) {
        if(A.length == 1) {
            return A[0];
        }

        Set<Integer> elements = new HashSet<>();
        for(int index = 0; index < A.length; index++) {
            if(elements.contains(A[index])) {
                elements.remove(A[index]);
            } else {
                elements.add(A[index]);
            }
        }

        Iterator<Integer> iter = elements.iterator();
        return iter.next();
    }
}
