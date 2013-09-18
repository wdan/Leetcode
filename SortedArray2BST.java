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
    public TreeNode sortedArrayToBST(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return replace(num, 0, num.length - 1);
    }
    public TreeNode replace(int[] num, int st, int ed){
        if (st > ed) return null;
        int mid = st + (ed - st) / 2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = replace(num, st, mid - 1);
        root.right = replace(num, mid + 1, ed);
        return root;
    }
}