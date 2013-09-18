/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head==null) return null;
        ListNode pre = null;
        ListNode now = head;
        while(now!=null){
            if (pre==null){
                pre = now;
                now = now.next;
            }else{
                if (now.val == pre.val){
                    now = now.next;
                }else{
                    pre.next = now;
                    pre = now;
                    now = now.next;
                }
            }
        }
        pre.next = null;
        return head;
    }
}