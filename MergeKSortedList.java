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
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (lists == null || lists.isEmpty()) return null;
        ListNode head = null;
        ListNode now = null;
        Comparator<ListNode> comparator = new Comparator<ListNode>(){
            public int compare(ListNode a, ListNode b){
                if (a.val < b.val)
                    return -1;
                else if (a.val > b.val)
                    return 1;
                else
                    return 0;
            }
        };
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.size(), comparator);
        for (int i=0;i<lists.size();i++){
            ListNode node = lists.get(i);
            if (node != null)
                pq.add(node);
        }
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            if (head == null){
                head = node;
                now = node;
                if (node.next!=null)
                    pq.add(node.next);
            }else{
                now.next = node;
                now = node;
                if (node.next!=null)
                    pq.add(node.next);
            }
        }
        if (now!=null) now.next = null;
        return head;
    }
}