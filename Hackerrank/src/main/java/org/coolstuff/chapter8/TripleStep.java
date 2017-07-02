package org.coolstuff.chapter8;

/**
 * Created by andersonkmi on 7/2/2017.
 */
public class TripleStep {
    public int count(int step) {
        if(step < 0) {
            return 0;
        } else if(step == 0) {
            return 1;
        } else {
            return count(step - 1) + count(step - 2) + count(step - 3);
        }
    }
}
