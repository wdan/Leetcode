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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        if (root == null) return ans;
        Stack<Integer> now = new Stack<Integer>();
        search(root, sum, root.val, ans, now);
        return ans;
    }
    public static void search(TreeNode root, int sum, int temp, ArrayList<ArrayList<Integer>> ans, Stack<Integer> now){
        if (root == null) return;
        now.push(root.val);
        if (root.left == null && root.right == null && temp == sum){
            ans.add(new ArrayList<Integer>(now));
            now.pop();
            return;
        }
        if (root.left!=null) search(root.left, sum, temp+root.left.val, ans, now);
        if (root.right!=null) search(root.right, sum, temp+root.right.val, ans, now);
        now.pop();
    }
}