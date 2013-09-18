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
    public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode stS = new ListNode(-1);
        ListNode stL = new ListNode(x);
        ListNode edS = stS, edL = stL;
        ListNode now = head;
        while(now!=null){
            if (now.val < x){
                edS.next = now;
                edS = now;
                now = now.next;
            }else{
                edL.next = now;
                edL = now;
                now = now.next;
            }
        }
        edS.next = stL.next;
        edL.next = null;
        return stS.next;
    }
}