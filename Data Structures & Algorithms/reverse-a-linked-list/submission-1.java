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
    public ListNode reverseList(ListNode head) {
        if(head == null)    return head;
        if(head.next == null)   return head;

        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode nextTemp = curr.next; //save the next head
            curr.next = prev; //reverse the link
            prev = curr; //move prev forward
            curr = nextTemp; //move curr forward
        }

        return prev;

    }
}
