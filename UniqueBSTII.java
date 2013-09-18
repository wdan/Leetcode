/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; left = null; right = null; }
 * }
 */
public class Solution {
    public ArrayList<TreeNode> generateTrees(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return generate(1, n);
    }
    public ArrayList<TreeNode> generate(int st, int ed){
        ArrayList<TreeNode> now = new ArrayList<TreeNode>();
        if (st > ed){
            now.add(null);
            return now;
        }
        for (int i=st;i<=ed;i++){
            ArrayList<TreeNode> left = generate(st, i - 1);
            ArrayList<TreeNode> right = generate(i+1, ed);
            for (int j=0;j<left.size();j++)
                for (int k=0;k<right.size();k++){
                    TreeNode root = new TreeNode(i);
                    root.left = left.get(j);
                    root.right = right.get(k);
                    now.add(root);
                }
        }
        return now;
    }
}