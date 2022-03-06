package easy;

public class Problem_203 {
    public ListNode removeElements(ListNode head, int val) {

        if (head == null) return null;

        for (ListNode start = head; start != null; start = start.next) {
            if (start.next.val == val) {
                if (start.next.next != null) {
                    start.next = start.next.next;
                    continue;
                }
                start.next = null;
            }
        }
        return head;
    }
}
