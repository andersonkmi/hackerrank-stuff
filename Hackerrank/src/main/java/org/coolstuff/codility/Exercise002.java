package org.coolstuff.codility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andersonkmi on 8/8/2016.
 */
public class Exercise002 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length == 0) {
            return 0;
        }

        if(A.length > 23) {
            return 25;
        }

        List<Integer> values = new ArrayList<>();
        int position = 0;
        int lastPosition = 0;
        while(position < A.length) {
            int startDate = A[position];
            int countDates = 1;
            int delta = 0;
            for(int index = position + 1; index < A.length && delta < 7; index++) {
                int nextDate = A[index];
                delta = nextDate - startDate;
                countDates++;
                if(countDates < 4) {
                    values.add(countDates * 2);
                } else {
                    values.add(7);
                }
                lastPosition = index;
            }
            position = lastPosition;
        }

        int total = 0;
        for(Integer value : values) {
            total += value;
        }
        return total;
    }
}
