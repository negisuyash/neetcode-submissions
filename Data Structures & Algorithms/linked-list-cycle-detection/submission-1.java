/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)   return false;
        ListNode curr = head;
        ListNode fastCurr = head;

        while(fastCurr!=null && fastCurr.next!=null){
            curr = curr.next;
            fastCurr = fastCurr.next.next;
            if(curr == fastCurr)    return true;
        }

        return false;
    }
}
