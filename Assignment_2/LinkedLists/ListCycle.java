import java.util.*;

public class ListCycle{
    public class ListNode {
     public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }

  	public ListNode detectCycle(ListNode a) {
          if(a== null)
	        return null;
	    if(a.next == null)
	        return a;
	    ListNode p1 = a;
	    ListNode p2 = a;
	    ListNode p3 = null;
	    p1= p1.next;
	    p2 = p2.next.next;
	    while(p2.next != null && p2.next.next != null){
	        p1 = p1.next;
	        p2 = p2.next.next;
	        
	        if(p1 == p2){
	            p1 = a;
	            while(p1!=p2){
	        p1 = p1.next;
	        p2 = p2.next;
	    }
	    return p1;
	        }
	    }
	    
	    return null;
	}
}