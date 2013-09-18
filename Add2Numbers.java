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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode st = new ListNode(0);
        ListNode p = null;
        ListNode t1=l1, t2=l2;
        int remain = 0;
        while(t1!=null||t2!=null){
            if (p!=null){
                p.next = new ListNode(0);
                p = p.next;
            }else
                p = st;
            int sum = remain;
            if (t1!=null){
                sum+=t1.val;
                t1 = t1.next;
            }
            if (t2!=null){
                sum+=t2.val;
                t2 = t2.next;
            }
            if (sum > 9){
                sum -= 10;
                remain = 1;
            }else{
                remain = 0;
            }
            p.val = sum;
        }
        if (remain>0){
            p.next = new ListNode(1);
        }
        return st;
    }
}