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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        if (root == null) return ans;
        Stack<TreeNode> current = new Stack<TreeNode>();
        Stack<TreeNode> next = new Stack<TreeNode>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        current.push(root);
        boolean left2right = true;
        while(!current.empty()){
            TreeNode now = current.pop();
            temp.add(now.val);
            if (left2right){
                if (now.left!=null)
                    next.add(now.left);
                if (now.right!=null)
                    next.add(now.right);
            }else{
                if (now.right!=null)
                    next.add(now.right);
                if (now.left!=null)
                    next.add(now.left);
            }
            if (current.empty()){
                current = next;
                next = new Stack<TreeNode>();
                ans.add(temp);
                left2right = !left2right;
                temp = new ArrayList<Integer>();
            }
        }
        return ans;
    }
}