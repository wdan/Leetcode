/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root == null) return;
        LinkedList<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        LinkedList<Integer> level = new LinkedList<Integer>();
        queue.add(root);
        level.add(1);
        TreeLinkNode pre = null;
        int preLevel = 0;
        while(queue.size()>0){
            TreeLinkNode now = queue.poll();
            int nowLevel = level.poll();
            if (nowLevel!=preLevel){
                pre = null;
                preLevel = nowLevel;
            }
            if (pre!=null){
                pre.next = now;
            }
            pre = now;
            if (now.left!=null){
                queue.add(now.left);
                level.add(nowLevel+1);
            }
            if (now.right!=null){
                queue.add(now.right);
                level.add(nowLevel+1);
            }
        }
    }
}