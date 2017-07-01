package org.coolstuff;

/**
 * Created by andersonkmi on 7/1/2017.
 */
public class Palindrome {
    private static class Node {
        Node next = null;
        int data = 0;

        public Node(int data) {
            this.data = data;
        }

        void append(int data) {
            Node node = new Node(data);

            Node n = this;

            while(n.next != null) {
                n = n.next;
            }

            n.next = node;
        }

        void printNodes() {
            Node node = this;

            while(node != null) {
                System.out.println("Node value: " + node.data);
                node = node.next;
            }
        }
    }

    public boolean isPalindrome(Node root) {
        StringBuilder buffer = new StringBuilder();

        Node node = root;
        while(node != null) {
            buffer.append(node.data);
            node = node.next;
        }

        String str1 = buffer.toString();
        char[] chars = str1.toCharArray();
        char[] reverse = new char[chars.length];

        for(int position = 0; position < reverse.length; position++) {
            reverse[position] = chars[chars.length - position - 1];
        }

        String str2 = new String(reverse);

        if(str1.equals(str2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.append(7);
        root.append(11);
        root.append(7);
        root.append(5);

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(root));
    }
}
