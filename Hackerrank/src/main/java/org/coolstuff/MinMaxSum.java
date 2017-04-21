package org.coolstuff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by andersonkmi on 4/21/2017.
 */
public class MinMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        List<Long> elements = new ArrayList<>();
        elements.add(a);
        elements.add(b);
        elements.add(c);
        elements.add(d);
        elements.add(e);

        Collections.sort(elements);
        Long min = new Long(0);
        for(int index = 0; index < elements.size() - 1; index++) {
            min += elements.get(index);
        }

        Long max = new Long(0);
        for(int index = 1; index < elements.size(); index++) {
            max += elements.get(index);
        }

        System.out.print(min + " " + max);
    }
}
