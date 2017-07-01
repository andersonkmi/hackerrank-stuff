package org.coolstuff;

import java.util.Arrays;

/**
 * Created by andersonkmi on 7/1/17.
 */
public class CheckPermutation {
    public boolean isPermutation(String first, String second) {
        if (first.equals(second)) {
            return true;
        } else if (first.length() != second.length()) {
            return false;
        } else {
            char[] firstChars = first.toCharArray();
            char[] secondChars = second.toCharArray();

            Arrays.sort(firstChars);
            Arrays.sort(secondChars);

            for(int index = 0; index < firstChars.length; index++) {
                if(firstChars[index] != secondChars[index]) {
                    return false;
                }
            }
        }
        return true;
    }
}
