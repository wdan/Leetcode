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
    public ListNode reverseKGroup(ListNode head, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        if (head == null || k <= 1) return head;
        ListNode pre = dummy;
        ListNode now = head;
        int count = 1;
        while(now!=null){
            if (count % k == 0){
                ListNode next = now.next;
                pre = reverse(pre, next);
                now = next;
            }else{
                now = now.next;
            }
            count++;
        }
        return dummy.next;
    }
    public static ListNode reverse(ListNode first, ListNode last){
        ListNode tail = first.next;
        ListNode now = tail;
        ListNode pre = null;
        while(now!=last){
            ListNode next = now.next;
            now.next = pre;
            pre = now;
            now = next;
        }
        first.next = pre;
        tail.next = last;
        return tail;
    }
}