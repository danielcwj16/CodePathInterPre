
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
import java.util.*;

public class AddTwoNumbersAsLists {
    public class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        if (a == null)
            return b;
        if (b == null)
            return a;

        ListNode res = new ListNode(-1);
        ListNode tail = res;
        int carry = 0;
        while (a != null || b != null) {
            int sum = (a == null ? 0 : a.val) + (b == null ? 0 : b.val) + carry;
            carry = sum / 10;
            sum %= 10;
            tail.next = new ListNode(sum);
            tail = tail.next;
            if (a != null)
                a = a.next;
            if (b != null)
                b = b.next;
        }
        if (carry == 1) {
            tail.next = new ListNode(carry);
        }

        return res.next;
    }
}