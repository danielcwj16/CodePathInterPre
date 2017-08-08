import java.util.*;

public class InorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public ArrayList<Integer> inorderTraversal(TreeNode a) {
        ArrayList<Integer> res = new ArrayList<Integer>();

        if(a == null)
            return res;
        ArrayList<Integer> left = inorderTraversal(a.left);
        res.addAll(left);
        res.add(a.val);
        ArrayList<Integer> right = inorderTraversal(a.right);
        res.addAll(right);

        return res;
    }
}