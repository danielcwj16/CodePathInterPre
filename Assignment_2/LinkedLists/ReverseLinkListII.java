/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
import java.util.*;
public class ReverseLinkListII {
    public class ListNode {
     public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }
	public ListNode reverseBetween(ListNode a, int m, int n) {
	    if(m == n)
	        return a;
	    ListNode dummy = new ListNode(0);
	    dummy.next = a;
	    ListNode curr = dummy;
	    ListNode end = a;
	    for(int i=0;i<n;i++){
	        end = end.next;
	    }
	    for(int i=0;i<m-1;i++){
	        curr = curr.next;
	    }
	    curr.next = reverse(curr.next, n-m+1);
	    while(curr.next != null){
	        curr = curr.next;
	    }
	    curr.next = end;
	    return dummy.next;
	}
	public ListNode reverse(ListNode head,int len){
	    ListNode next = null;
	    ListNode previous = null;
	    ListNode curr = head;
	    for(int i=0;i<len;i++){
	        next = curr.next;
	        curr.next = previous;
	        previous = curr;
	        curr = next;
	    }
	    return previous;
	}
}
