package easy;

import java.util.HashSet;
import java.util.Set;

public class Problem_141 {
        /*
    Name: Linked List Cycle
    Difficulty: Easy
    Link: https://leetcode.com/problems/linked-list-cycle/
     */

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        for (ListNode fast = head, slow = head; fast != null && fast.next != null;) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) { return true; }
        }
        return false;
    }
}
