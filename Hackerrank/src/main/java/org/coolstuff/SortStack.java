package org.coolstuff;

import java.util.Stack;

/**
 * Created by andersonkmi on 7/1/2017.
 */
public class SortStack {
    public void sort(Stack<Integer> stack) {
        Stack<Integer> helper = new Stack<>();
        while(!stack.isEmpty()) {
            Integer current = stack.pop();
            if(helper.isEmpty() || current > helper.peek()) {
                helper.push(current);
            } else {
                int movements = 0;
                while(!helper.isEmpty() && current < helper.peek()) {
                    stack.push(helper.pop());
                    movements++;
                }
                helper.push(current);

                for(int i = 0; i < movements; i++) {
                    helper.push(stack.pop());
                }
            }
        }

        while(!helper.isEmpty()) {
            stack.push(helper.pop());
        }
    }

    public static void main(String[] args) {
        SortStack sort = new SortStack();

        Stack<Integer> elements = new Stack<>();
        elements.push(3);
        elements.push(2);
        elements.push(12);
        elements.push(10);
        elements.push(13);


        sort.sort(elements);
        System.out.println("Done");
    }
}
