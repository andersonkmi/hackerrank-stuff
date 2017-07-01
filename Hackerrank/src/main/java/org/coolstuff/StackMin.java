package org.coolstuff;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by andersonkmi on 7/1/2017.
 */
public class StackMin {
    private static class StackNode {
        private int data;
        private StackNode next;

        public StackNode(int data) {
            this.data = data;
        }
    }

    private StackNode top;
    private Stack<Integer> minValues = new Stack<>();

    public int pop() {
        if(top == null) {
            throw new EmptyStackException();
        }

        int value = top.data;
        top = top.next;
        if(value == getMinimumValue()) {
            minValues.pop();
        }
        return value;
    }

    public void push(int value) {
        StackNode node = new StackNode(value);
        node.next = top;
        top = node;
        if(value < getMinimumValue()) {
            minValues.push(value);
        }
    }

    public int getMinimumValue() {
        if(minValues.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        return minValues.peek();
    }
}
