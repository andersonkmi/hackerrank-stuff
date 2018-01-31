package org.sharpsw.leetcode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean take1 = false;

        ListNode root1 = l1;
        ListNode root2 = l2;

        ListNode current = null;
        ListNode result = null;
        while(root1 != null || root2 != null) {
            int val1 = 0;
            int val2 = 0;

            if(root1 != null) {
                val1 = root1.val;
            }

            if(root2 != null) {
                val2 = root2.val;
            }

            int amount = val1 + val2;
            if (take1) {
                amount++;
            }

            if(amount >= 10) {
                amount = amount % 10;
                take1 = true;
            } else {
                take1 = false;
            }

            ListNode node = new ListNode(amount);
            if(current != null) {
                current.next = node;
            } else {
                result = node;
            }
            current = node;

            if(root1 != null) {
                root1 = root1.next;
            }

            if(root2 != null) {
                root2 = root2.next;
            }
        }

        if(take1) {
            ListNode node = new ListNode(1);
            current.next = node;
        }

        return result;
    }
}
