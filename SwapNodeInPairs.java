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
    public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode ans = null;
        ListNode pre = null;
        ListNode now = head;
        while (now!=null){
            ListNode suc = now.next;
            if (suc!=null){
                if (pre!=null)
                    pre.next = suc;
                now.next = suc.next;
                suc.next = now;
                pre = now;
                if (ans==null) ans = suc;
            }
            now = now.next;
        }
        if (ans==null) return head;
        else return ans;
    }
}