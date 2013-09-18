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
        TreeLinkNode left = root;
        while(left!=null){
            TreeLinkNode worker = left;
            while(worker!=null){
                if (worker.left!=null && worker.right!=null){
                    worker.left.next = worker.right;
                }
                if (worker.right!=null && worker.next!=null){
                    worker.right.next = worker.next.left;
                }
                worker = worker.next;
            }
            left = left.left;
        }
    }
}