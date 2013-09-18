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
    public static int max;
    public int maxPathSum(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        max = Integer.MIN_VALUE;
        search(root);
        return max;
    }
    public static int search(TreeNode root){
        if (root==null) return Integer.MIN_VALUE / 2;
        if (root.val > max) max = root.val;
        if (root.left == null && root.right == null) return root.val;
        int left = search(root.left);
        int right = search(root.right);
        if (left > max) max = left;
        if (right > max) max = right;
        if (left + right + root.val > max) max = left + right + root.val;
        int now = root.val;
        now = Math.max(now, root.val + left);
        now = Math.max(now, root.val + right);
        if (now > max) max = now;
        return now;
    }
}