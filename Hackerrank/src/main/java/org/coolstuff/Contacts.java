package org.coolstuff;

import java.util.*;

/**
 * Created by andersonkmi on 6/21/2017.
 */
public class Contacts {
    private static class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public int size = 0;


        private static int getCharIndex(char c) {
            return c - 'a';
        }

        private TrieNode getNode(char c) {
            return children[getCharIndex(c)];
        }

        private void setNode(char c, TrieNode node) {
            children[getCharIndex(c)] = node;
        }

        public void add(String str) {
            add(str, 0);
        }

        private void add(String str, int index) {
            if(index == str.length()) {
                return;
            }

            size++;
            char current = str.charAt(index);
            TrieNode child = getNode(current);
            if(child == null) {
                child = new TrieNode();
                setNode(current, child);
            }

            child.add(str, index + 1);
        }

        public int findCount(String prefix, int index) {
            if(index == prefix.length()) {
                return size;
            }

            TrieNode node = getNode(prefix.charAt(index));
            if(node == null) {
                return 0;
            }
            return node.findCount(prefix, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lines = in.nextLine();

        TrieNode root = new TrieNode();
        for(int index = 0; index < Integer.parseInt(lines); index++) {
            String line = in.nextLine();

            StringTokenizer tokenizer = new StringTokenizer(line);
            String command = tokenizer.nextToken();
            String name = tokenizer.nextToken();

            if(command.equals("add")) {
                root.add(name);
            } else if(command.equals("find")) {
                root.findCount(name, 0);
            }
        }
    }
}
