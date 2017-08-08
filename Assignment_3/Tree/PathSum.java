import java.util.*;
public class PathSum {
	public int hasPathSum(TreeNode a, int b) {
	    if(a == null)
	        return 0;
	    LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
	    queue.offer(a);
	    while(!queue.isEmpty()){
	        TreeNode node = queue.poll();
	        if(b == node.val && node.left == null && node.right == null)
	            return 1;
	              if(node.left != null ){
	                  queue.offer(node.left);
	                  node.left.val += node.val;
	              };
	              if(node.right != null){
	                  queue.offer(node.right);
	                  node.right.val += node.val;
	              }
	    }
	    return 0;
	}
}