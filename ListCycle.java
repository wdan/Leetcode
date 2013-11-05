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
    public boolean hasCycle(ListNode head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (head == null) return false;
        ListNode first = head;
        ListNode second = head;
        while(first!=null){
            first = first.next;
            second = second.next;
            if (second == null) return false;
            second = second.next;
            if (first == second) return true;
            if (second == null) return false;
        }
        return false;
    }
}