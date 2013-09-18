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
    public static TreeNode n1;
    public static TreeNode n2;
    public static TreeNode pre;
    public void recoverTree(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        n1 = null;
        n2 = null;
        pre = null;
        inorder(root);
        int temp = n1.val;
        n1.val = n2.val;
        n2.val = temp;
    }
    public static void inorder(TreeNode root){
        if (root == null) return;
        inorder(root.left);
        if (pre!=null && pre.val > root.val){
            if (n1 == null){
                n1 = pre;
                n2 = root;
            }else{
                n2 = root;
            }
        }
        pre =  root;
        inorder(root.right);
    }
}