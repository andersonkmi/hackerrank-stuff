package org.coolstuff.codility;

/**
 * Created by andersonkmi on 8/7/16.
 */
public class BinaryGap {
    public int solution(int N) {
        // write your code in Java SE 8
        if(N == 1) {
            return 0;
        }

        int binaryGapSize = 0;
        String binaryRepresentation = Integer.toBinaryString(N);
        int initialIndex = binaryRepresentation.indexOf('0', 1);
        while(initialIndex != -1) {
            int currentSize = 0;
            int finalPosition = initialIndex;
            while(finalPosition < binaryRepresentation.length() && binaryRepresentation.charAt(finalPosition) == '0') {
                finalPosition++;
            }

            if(finalPosition < binaryRepresentation.length()) {
                currentSize = finalPosition - initialIndex;
                if(currentSize > binaryGapSize) {
                    binaryGapSize = currentSize;
                }
            }

            initialIndex = binaryRepresentation.indexOf('0', finalPosition);
        }

        return binaryGapSize;
    }

    public static void main(String[] args) {
        BinaryGap service = new BinaryGap();
        service.solution(561892);
    }
}
