package org.coolstuff;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by andersonkmi on 6/27/2017.
 */
public class QueueWithTwoStacks {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }

    private static class MyQueue<T> {
        private Stack<T> stack1 = new Stack<>();
        private Stack<T> stack2 = new Stack<>();

        void enqueue(T item) {
            stack1.push(item);
        }

        void dequeue() {
            if(stack2.isEmpty()) {
                while(!stack1.empty()) {
                    stack2.push(stack1.pop());
                }
            }

            stack2.pop();
        }

        T peek() {
            if(stack2.isEmpty()) {
                while(!stack1.empty()) {
                    stack2.push(stack1.pop());
                }
            }

            T element = stack2.peek();
            return element;
        }
    }
}
