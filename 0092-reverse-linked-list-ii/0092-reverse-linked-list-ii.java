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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode t1 = dummy;
            int count = 1;
            while(count < left){
                count++;
                t1 = t1.next;
            }
            ListNode first = t1;
            ListNode t2 = t1.next;
            ListNode t3;
            ListNode tail = t2;
            while(count <= right){
                count++;
                t3 = t2.next;
                t2.next = t1;
                t1 = t2;
                t2 = t3;
            }
            first.next = t1;
            tail.next = t2;
            
        return dummy.next;
    }
}