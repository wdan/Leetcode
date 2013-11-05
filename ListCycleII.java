/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (head == null) return null;
        ListNode first = head;
        ListNode second = head;
        while (second.next!=null){
            first = first.next;
            second = second.next.next;
            if (first == second) break;
            if (second == null) break;
        }
        if (second == null || second.next == null) return null;
        first = head;
        while (first!=second){
            first = first.next;
            second = second.next;
        }
        return first;
    }
}