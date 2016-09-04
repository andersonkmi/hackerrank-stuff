package org.coolstuff.codility;

/**
 * Created by andersonkmi on 9/4/2016.
 */
public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int distance = Y - X;
        int jumps = distance / D;
        if(distance % D > 0) {
            jumps++;
        }
        return jumps;
    }
}
