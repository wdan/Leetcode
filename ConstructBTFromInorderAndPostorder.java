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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return buildTree(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1);
    }
    public TreeNode buildTree(int[] inorder, int[] postorder, int inSt, int inEd, int poSt, int poEd){
        if (inSt > inEd) return null;
        if (inSt == inEd)
            return new TreeNode(inorder[inSt]);
        int val = postorder[poEd];
        TreeNode root = new TreeNode(val);
        int num = 0;
        for (int i=inSt;i<=inEd;i++){
            if (inorder[i] == val){
                num = i - inSt;
                break;
            }
        }
        root.left = buildTree(inorder, postorder, inSt, inSt+num-1, poSt, poSt+num-1);
        root.right = buildTree(inorder, postorder, inSt+num+1, inEd, poSt+num, poEd-1);
        return root;
    }
}