package org.coolstuff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by andersonkmi on 7/23/16.
 */
public class NewYearChaos {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        List<int[]> inputData = new ArrayList<>();
        for(int counter = 0; counter < testCases; counter++) {
            int quantityNumbers = in.nextInt();
            int[] testCase = new int[quantityNumbers];
            for(int index = 0; index < quantityNumbers; index++) {
                testCase[index] = in.nextInt();
                inputData.add(testCase);
            }
        }

        // Structure where the result will be stored
        List<String> results = new ArrayList<>();

        // For each item in the list, verifies if there were bribes
    }
}
