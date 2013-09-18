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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return buildTree(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
    }
    public TreeNode buildTree(int[] preorder, int[] inorder, int preSt, int preEd, int inSt, int inEd){
        if (inSt > inEd) return null;
        if (inSt == inEd) return new TreeNode(inorder[inSt]);
        int val = preorder[preSt];
        int num = 0;
        for (int i=inSt;i<=inEd;i++){
            if (inorder[i] == val){
                num = i - inSt;
                break;
            }
        }
        TreeNode root = new TreeNode(val);
        root.left = buildTree(preorder, inorder, preSt+1, preSt+num, inSt, inSt+num-1);
        root.right = buildTree(preorder, inorder, preSt+num+1, preEd, inSt+num+1, inEd);
        return root;
    }
}