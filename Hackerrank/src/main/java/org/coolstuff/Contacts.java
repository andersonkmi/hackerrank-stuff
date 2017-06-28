package org.coolstuff;

import java.util.*;

/**
 * Created by andersonkmi on 6/21/2017.
 */
public class Contacts {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        List<Long> findResults = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        String lines = in.nextLine();
        for(int index = 0; index < Integer.parseInt(lines); index++) {
            String line = in.nextLine();

            StringTokenizer tokenizer = new StringTokenizer(line);
            String command = tokenizer.nextToken();
            String name = tokenizer.nextToken();

            if(command.equals("add")) {
                names.add(name);
            } else if(command.equals("find")) {
                // Execute the find command
                long result = names.stream().filter(t -> t.startsWith(name)).count();
                findResults.add(result);
            }
        }

        findResults.stream().forEach(item -> System.out.println(item));
    }
}
