package org.coolstuff;

import java.util.Scanner;

public class Grading {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];

        for(int grades_i=0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }

        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }

    static int[] solve(int[] grades){
        int[] result = new int[grades.length];
        int index = 0;

        for (int number: grades) {
            if(number < 38) {
                result[index] = number;
            } else {
                int diff = findNextMultipleDiff(number);
                if(diff < 3) {
                    result[index] = number + diff;
                } else {
                    result[index] = number;
                }
            }
            index++;
        }
        return result;
    }

    private static int findNextMultipleDiff(int number) {
        if(number % 5 == 0) {
            return 0;
        }
        String convertedNumber = Integer.toString(number);
        int firstDigit = Integer.parseInt(String.valueOf(convertedNumber.charAt(convertedNumber.length() - 1)));
        if(firstDigit >= 1 && firstDigit <= 4) {
            return 5 - firstDigit;
        } else {
            return 10 - firstDigit;
        }
    }
}
