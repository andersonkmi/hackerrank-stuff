package org.funprog;

public class BreakingTheRecords {
    public int[] breakingRecords(int[] score) {
        int[] results = {0, 0};
        int high = score[0];
        int low = score[0];

        for(int index = 1; index < score.length; index++) {
            if(score[index] > high) {
                results[0]++;
                high = score[index];
            } else if(score[index] < low) {
                results[1]++;
                low = score[index];
            }
        }

        return results;
    }
}
