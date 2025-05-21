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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode trav = head;
        int count = 0;
        if(trav.next == null){
            return null;
        }
        while(trav != null){
            count++;
            trav = trav.next;
        }
        if(count == n){
            return head.next;
        }
        trav = head;
        for(int i=1; i<count-n; i++){
            trav = trav.next;
        }
        if(trav.next == null){
            trav = null;
        }
        else{
            trav.next = trav.next.next;
        }
        return head;
    }
}