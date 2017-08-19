package org.coolstuff.timeconversion;

import java.util.Scanner;

public class Solution {
    static String timeConversion(String s) {
        // Complete this function
        String hourStr = s.substring(0, 2);
        int hour = Integer.parseInt(hourStr);
        String format = s.substring(8, s.length());
        String rest = s.substring(2, 8);

        StringBuilder builder = new StringBuilder();
        if(format.equals("AM")) {
            if(hour == 12) {
                builder.append("00").append(rest);
            } else {
                builder.append(hourStr).append(rest);
            }
        } else if(format.equals("PM")) {
            if(hour >= 1 && hour <= 11) {
                builder.append(hour + 12).append(rest);
            } else {
                builder.append(hour).append(rest);
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
