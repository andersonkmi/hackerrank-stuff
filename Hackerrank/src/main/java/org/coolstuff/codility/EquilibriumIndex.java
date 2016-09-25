package org.coolstuff.codility;

/**
 * Created by andersonkmi on 8/8/2016.
 */
public class EquilibriumIndex {
    public int solution(int[] A) {

        for(int index = 0; index < A.length; index++) {
            int position = equi(A, index);
            if(position != -1) {
                return position;
            }
        }
        return -1;
    }

    private int equi(int arr[], int n) {
        if (n==0)
            return -1;

        long sum = 0;
        int i;
        for(i=0;i<n;i++) sum += arr[i];

        long sum_left = 0;
        for(i=0;i<n;i++) {
        long sum_right = sum - sum_left - arr[i];
            if (sum_left == sum_right) return i;
            sum_left += arr[i];
        }
        return -1;
    }
}
