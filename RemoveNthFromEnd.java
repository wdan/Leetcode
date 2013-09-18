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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode p = head;
        ListNode st = null;
        int count = 0;
        while(p.next!=null){
            p = p.next;
            count++;
            if (count == n){
                st = head;
            }else if (count > n){
                st = st.next;
            }
        }
        if (n - count == 1) return head.next;
        //if (st == null) return null;
        st.next = st.next.next;
        return head;
    }
}