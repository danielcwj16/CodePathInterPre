import java.util.*;
public class IdenticalBinaryTree {
	public int isSameTree(TreeNode a, TreeNode b) {
        if(a == null && b == null)
            return 1;
        if(a != null && b != null)
            return ((a.val == b.val) && isSameTree(a.left,b.left) ==1 && isSameTree(a.right,b.right)==1) ? 1 : 0;
            
        return 0;
	}
}