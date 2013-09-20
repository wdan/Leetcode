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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        if (head == null) return null;
        ListNode pre = dummy;
        ListNode M = null;
        ListNode H = null;
        ListNode now = head;
        int count = 1;
        while(now!=null){
            if (count == m){
                M = pre;
                H = now;
            }else if (count > m && count <= n){
                ListNode next = now.next;
                now.next = pre;
            }
            if (count == n){
                break;
            }
            pre = now;
            now = now.next;
            count++;
        }
        M.next = pre;
        H.next = now;
        return dummy.next;
    }
}