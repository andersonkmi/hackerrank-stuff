package org.coolstuff;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by andersonkmi on 7/1/17.
 */
public class RemoveDups {
    static class Node {
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

    public void removeDups(Node root) {
        Set<Integer> values = new HashSet<>();

        Node node = root;
        values.add(node.data);
        while(node.next != null) {
            if(values.contains(node.next.data)) {
                // must remove it
                node.next = node.next.next;
            } else {
                values.add(node.next.data);
            }

            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.append(7);
        root.append(11);
        root.append(7);
        root.append(2);

        root.printNodes();

        RemoveDups service = new RemoveDups();
        service.removeDups(root);
        System.out.println("Done");

        root.printNodes();
    }
}
