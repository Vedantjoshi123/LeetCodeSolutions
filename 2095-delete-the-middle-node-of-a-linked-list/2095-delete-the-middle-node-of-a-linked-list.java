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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow  = head;
        ListNode fast = head;
        if(slow.next == null){
            return null;
        }
        if(slow.next != null && slow.next.next == null){
            slow.next = null;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode trav = slow.next;
        if(trav == null){
            slow = null;
        }
        else{
            while(trav != null){
                slow.val = trav.val;
                if(trav.next == null){
                    slow.next = null;
                }
                slow = trav;
                trav = trav.next;
            }
            System.out.println(slow.next);
            slow = null;
        }

        return head;
    }
}