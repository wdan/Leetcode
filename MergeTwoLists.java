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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode A = l1;
        ListNode B = l2;
        ListNode head = null;
        ListNode pre = null;
        while(A!=null && B!=null){
            if (A.val > B.val){
                if (head == null){
                    head = B;
                    pre = B;
                    B = B.next;
                }else{
                    pre.next = B;
                    pre = B;
                    B = B.next;
                }
            }else{
                if (head == null){
                    head = A;
                    pre = A;
                    A = A.next;
                }else{
                    pre.next = A;
                    pre = A;
                    A = A.next;
                }
            }
        }
        if (A!=null) pre.next = A;
        if (B!=null) pre.next = B;
        return head;
    }
}