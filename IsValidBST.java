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
    public boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public static boolean isValidBST(TreeNode root, int min, int max){
        if (root == null) return true;
        if (root.val < min || root.val > max) return false;
        return isValidBST(root.left, min, root.val - 1) && isValidBST(root.right, root.val + 1, max);
    }
}