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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Stack<TreeNode> st = new Stack<TreeNode>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if (root == null) return ans;
        TreeNode now = root;
        while(!st.empty() || now!=null){
            if (now!=null){
                st.push(now);
                now = now.left;
            }else{
                now = st.pop();
                ans.add(now.val);
                now = now.right;
            }
        }
        return ans;
    }
}