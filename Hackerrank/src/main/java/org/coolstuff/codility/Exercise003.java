package org.coolstuff.codility;

/**
 * Created by andersonkmi on 8/8/2016.
 */
public class Exercise003 {
}
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
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
            int index = position;
            while(index < A.length && delta < 7) {
                int nextDate = A[index];
                delta = nextDate - startDate;
                countDates++;
                index++;
            }

            if(countDates < 4) {
                values.add(countDates * 2);
            } else {
                values.add(7);
            }

            position = index;
        }

        int total = 0;
        for(Integer value : values) {
            total += value;
        }
        return total;
    }
}