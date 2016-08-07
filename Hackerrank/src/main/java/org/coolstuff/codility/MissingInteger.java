package org.coolstuff.codility;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by andersonkmi on 8/7/2016.
 */
public class MissingInteger {
    public int solution(int[] A) {
        if(A.length == 1) {
            if(A[0] > 1) {
                return 1;
            } else if(A[0] <= 0){
                return 1;
            } else {
                return A[0] + 1;
            }
        }

        Set<Integer> numbers = new TreeSet<>();
        for(int index = 0; index < A.length; index++) {
            if (A[index] > 0) {
                numbers.add(A[index]);
            }
        }

        int counter = 0;
        int notFound = 1;
        for(Integer number : numbers) {
            if(counter++ == 0) {
                Integer firstitem = number;
                if(number > 1) {
                    break;
                }
            } else {
                Integer nextValue = number + 1;
                if(!numbers.contains(nextValue)) {
                    notFound = nextValue;
                    break;
                }
            }
        }
        return notFound;
    }
}
