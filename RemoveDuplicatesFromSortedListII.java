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
        if (head == null) return null;
        ListNode ans = null;
        ListNode now = head;
        ListNode pre = null;
        boolean duplicate = false;
        while(now!=null){
            if (now.next!=null && now.val == now.next.val){
                duplicate = true;
                now = now.next;
                continue;
            }
            if (duplicate){
                duplicate = false;
                now = now.next;
                continue;
            }
            if (ans == null){
                ans = now;
                pre = now;
                now = now.next;
            }else{
                pre.next = now;
                pre = now;
                now = now.next;
            }
        }
        if (pre!=null) pre.next = null;
        return ans;
    }
}