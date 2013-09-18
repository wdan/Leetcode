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
    public ListNode rotateRight(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null) return null;
        ListNode now = head;
        int count = 0;
        ListNode pre = null;
        while(now!=null){
            pre = now;
            now = now.next;
            count++;
        }
        if (n % count == 0) return head;
        n = count - n % count;
        now = head;
        while(n-1>0){
            now = now.next;
            n--;
        }
        ListNode ans = now.next;
        now.next = null;
        pre.next = head;
        return ans;
    }
}