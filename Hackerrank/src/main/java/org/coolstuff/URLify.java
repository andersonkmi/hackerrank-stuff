package org.coolstuff;

/**
 * Created by andersonkmi on 6/28/2017.
 */
public class URLify {
    public void execute(char[] word) {
        for(int index = 0; index < word.length; index++) {
            if(word[index] == ' ') {
                int back = word.length - 1;
                while(word[back] == ' ') {
                    back--;
                }
                for(int position = back; position > index; position--) {
                    word[position + 2] = word[position];
                }

                word[index] = '%';
                word[index + 1] = '2';
                word[index + 2] = '0';
            }
        }
    }

    public static void main(String[] args) {
        URLify service = new URLify();
        char[] word = new char[17];
        word[0] = 'M';
        word[1] = 'r';
        word[2] = ' ';
        word[3] = 'J';
        word[4] = 'o';
        word[5] = 'h';
        word[6] = 'n';
        word[7] = ' ';
        word[8] = 'S';
        word[9] = 'm';
        word[10] = 'i';
        word[11] = 't';
        word[12] = 'h';
        word[13] = ' ';
        word[14] = ' ';
        word[15] = ' ';
        word[16] = ' ';

        service.execute(word);
        System.out.println(word);
    }
}
