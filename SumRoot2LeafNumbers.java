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
    public static int sum = 0;
    public int sumNumbers(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int now = 0;
        sum = 0;
        search(root, now);
        return sum;
    }
    public static void search(TreeNode root, int now){
        if (root == null) return;
        now*=10;
        now+=root.val;
        if ((root.left == null)&&(root.right == null)){
            sum+=now;
            return;
        }
        search(root.left, now);
        search(root.right, now);
    }
}