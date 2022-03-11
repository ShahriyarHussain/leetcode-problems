package medium;

import easy.ListNode;

public class Problem_2 {
    /*
    Name: Add Two Numbers
    Difficulty: Medium
    Link: https://leetcode.com/problems/add-two-numbers/
    */

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode(), prevNode = head;

        for (ListNode start = head, l1Head = l1, l2Head = l2;
             l1Head != null || l2Head != null;) {
            int valOfNode1 = 0, valOfNode2 = 0, sum = 0;

            if (l1Head != null) {
                valOfNode1 = l1Head.val;
                l1Head = l1Head.next;
            }
            if (l2Head != null) {
                valOfNode2 = l2Head.val;
                l2Head = l2Head.next;
            }

            sum = valOfNode1 + valOfNode2 + carry;
            carry = sum /10;
            start.val = sum % 10;
            start.next = new ListNode();
            prevNode = start;
            start = start.next;
        }

        if (carry != 0) {
            prevNode.next = new ListNode();
            prevNode.next.val = carry;
        } else { prevNode.next = null; }

        return head;
    }

}
