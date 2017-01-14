package org.coolstuff.cci;

import java.util.Scanner;

/**
 * Created by andersonkmi on 12/26/2016.
 */
public class ArrayLeftRoation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        // Creates the array of rotated items
        int[] rotatedItems = new int[k];
        for(int index = 0; index < k; index++) {
            rotatedItems[index] = a[index];
        }

        // Move items from the back to the front
        for(int pos = k; pos < a.length; pos++) {
            a[pos - k] = a[pos];
        }

        // Inserts the roated items into the final position of the array
        int start = a.length - k;
        for(int pos = 0; pos < rotatedItems.length; pos++) {
            a[start + pos] = rotatedItems[pos];
        }

        // Prints the resulting array
        for(int pos = 0; pos < a.length; pos++) {
            System.out.print(a[pos] + " ");
        }
    }
}
