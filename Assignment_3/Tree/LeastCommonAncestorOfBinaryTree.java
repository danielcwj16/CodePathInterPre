

import java.util.*;

public class LeastCommonAncestorOfBinaryTree{
    public int lca(TreeNode a, int val1, int val2) {
	    TreeNode node1 = findNode(a,val1);
	    TreeNode node2 = findNode(a,val2);
	    
	    if(node1 == null || node2 == null)
	        return -1;
	    
	    TreeNode node =  findLCA(a,node1,node2);
	    return node == null ? -1 : node.val;
	}
	
	public TreeNode findNode(TreeNode a,int val1){
	    if(a == null)
	        return null;
	    if(a.val == val1)
	        return a;
	    
	    TreeNode left = findNode(a.left,val1);
	    TreeNode right = findNode(a.right,val1);
	    if(left == null)
	        return right;
	    return left;
	}
	
	public TreeNode findLCA(TreeNode root,TreeNode p,TreeNode q){
	    if (root == null || root == p || root == q)
            return root;
        TreeNode left = findLCA(root.left, p, q);
        TreeNode right = findLCA(root.right, p, q);
        return left == null ? right : right == null ? left : root;
	}
}

