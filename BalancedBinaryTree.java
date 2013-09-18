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
    public boolean isBalanced(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return (height(root)>=0);
    }
    public int height(TreeNode root){
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        if (left < 0 || right < 0 || Math.abs(left - right) > 1) return -1;
        return Math.max(left, right) + 1;
    }
}