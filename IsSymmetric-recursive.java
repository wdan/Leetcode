/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }
    public static boolean isSymmetric(TreeNode left, TreeNode right){
        if (left==null || right==null){
            if (left==null && right==null) return true;
            return false;
        }
        if (left.val != right.val) return false;
        if (!isSymmetric(left.right, right.left)) return false;
        if (!isSymmetric(right.right, left.left)) return false;
        return true;
    }
}