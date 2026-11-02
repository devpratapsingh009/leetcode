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
    int c=0;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
        return null;
        head.next=removeNthFromEnd(head.next, n);
        c++;
        if(c==n){
            return head.next;
        }
        return head;
    }
}