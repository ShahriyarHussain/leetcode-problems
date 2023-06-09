package medium;



public class Problem_19 {

    /*
    Name: Remove Nth Node From End of List
    Difficulty: Medium
    Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    */

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int difference = 1;
        ListNode nodeToRemove = head;

        for (ListNode start = head.next; start != null; start = start.next) {
            if (difference > n) {
                nodeToRemove = nodeToRemove.next;
                continue;
            }
            difference++;
        }

        if (n == difference) return head.next;
        if (nodeToRemove.next.next == null) {
            nodeToRemove.next = null;
            return head;
        }
        nodeToRemove.next = nodeToRemove.next.next;
        return head;
    }

     class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


}


