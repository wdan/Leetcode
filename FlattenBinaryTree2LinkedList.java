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
    public void flatten(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root == null) return;
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left!=null){
            root.right = left;
            root.left = null;
            TreeNode rightMost = left;
            while(rightMost.right!=null) rightMost = rightMost.right;
            rightMost.right = right;
        }
        flatten(root.right);
    }
}