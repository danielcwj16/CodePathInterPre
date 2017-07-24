import java.util.*;

public class InsertSortList{
    public ListNode insertionSortList(ListNode a) {
	    if(a == null)
	        return a;
	       
	    ListNode head = a;
	    ListNode dummy = new ListNode(-1);
	    while(head!= null){
	        ListNode curr = dummy;
	        while(curr.next != null && curr.next.val < head.val){
	            curr = curr.next;
	        }
	        ListNode temp = head.next;
	        head.next = curr.next;
	        curr.next = head;
	        head = temp;
	    }
	    
	    return dummy.next;
	}
}