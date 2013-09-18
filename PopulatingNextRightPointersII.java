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
        TreeLinkNode now = root;
        while(now!=null){
            TreeLinkNode next = null;
            TreeLinkNode pre = null;
            while (now!=null){
                if (next == null)
                    next = now.left != null ? now.left : now.right;
                if (now.left!=null){
                    if (pre != null)
                        pre.next = now.left;
                    pre = now.left;
                }
                if (now.right!=null){
                    if (pre != null)
                        pre.next = now.right;
                    pre = now.right;
                }
                now = now.next;
            }
            now = next;
        }
    }
}