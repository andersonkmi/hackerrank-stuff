package org.coolstuff.codility;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by andersonkmi on 9/5/2016.
 */
public class FrogRiverOne {
    public int solution(int X, int[] A) {
        Set<Integer> leaves = new HashSet<>();
        for(int leaf = 1; leaf <= X; leaf++) {
            leaves.add(leaf);
        }

        int index = -1;
        for(int leaf : A) {
            index++;
            if(leaves.contains(leaf)) {
                leaves.remove(leaf);
            }

            if(leaves.isEmpty()) {
                break;
            }
        }

        if(!leaves.isEmpty()) {
            index = -1;
        }
        return index;
    }
}
