package easy;

public class Problem_206 {

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode curr = head;
        for (ListNode next, prev = null;;) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            if (next == null) {
                break;
            }
            curr = next;
        }
        return curr;
    }

}
