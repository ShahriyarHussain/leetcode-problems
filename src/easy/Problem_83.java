package easy;

public class Problem_83 {

    /*
    Name: Remove Duplicates From Sorted List
    Difficulty: Easy
    Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
     */

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode node = head;
        while (node.next != null) {
            if (node.next.val == node.val) {
                node.next = node.next.next;
                continue;
            }
            node = node.next;
        }
        return head;
    }


}
