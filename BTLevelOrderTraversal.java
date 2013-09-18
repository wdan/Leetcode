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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root == null) return new ArrayList<ArrayList<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        LinkedList<Integer> level = new LinkedList<Integer>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        queue.add(root);
        int pre = 1;
        level.add(1);
        TreeNode node;
        while((node=queue.poll())!=null){
            int nowLevel = level.poll();
            if (pre!=nowLevel){
                ans.add(temp);
                temp = new ArrayList<Integer>();
                temp.add(node.val);
                pre = nowLevel;
            }else{
                temp.add(node.val);
            }
            if (node.left!=null){
                queue.add(node.left);
                level.add(nowLevel+1);
            }
            if (node.right!=null){
                queue.add(node.right);
                level.add(nowLevel+1);
            }
        }
        ans.add(temp);
        return ans;
    }
}