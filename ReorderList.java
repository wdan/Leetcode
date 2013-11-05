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
    public void reorderList(ListNode head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (head == null || head.next == null) return;
        ListNode first = head;
        ListNode second = head.next;
        while(second.next!=null){
            first = first.next;
            second = second.next;
            if (second.next == null) break;
            second = second.next;
        }
        reverse(first);
        first.next = null;
        first = head;
        ListNode now = first;
        first = first.next;
        int i = 0;
        while(now!=null){
            if (i % 2 == 0){
                now.next = second;
                if (second!=null) second = second.next;
            }else{
                now.next = first;
                if (first!=null) first = first.next;
            }
            now = now.next;
            i++;
        }
    }
    public static void reverse(ListNode first){
        ListNode pre = null;
        ListNode now = first.next;
        while(now!=null){
            ListNode next = now.next;
            now.next = pre;
            pre = now;
            now = next;
        }
        return;
    }
}