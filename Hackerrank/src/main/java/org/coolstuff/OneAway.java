package org.coolstuff;

/**
 * Created by andersonkmi on 7/1/17.
 */
public class OneAway {
    public boolean verify(String str1, String str2) {
        if(str1.equals(str2)) {
            return false;
        }

        int[] characters = new int[128];

        for(char item : str1.toCharArray()) {
            characters[item]++;
        }

        for(char item : str2.toCharArray()) {
            if(characters[item] > 0) {
                characters[item]--;
            } else {
                characters[item]++;
            }

        }

        int distinctChars = 0;
        for (int character : characters) {
            if (character == 1) {
                distinctChars++;
            }
        }

        if((distinctChars == 1) || (distinctChars == 2)) {
            return true;
        }
        return false;
    }
}
