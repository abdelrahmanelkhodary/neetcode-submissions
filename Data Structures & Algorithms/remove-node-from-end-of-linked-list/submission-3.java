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
        
        int length=0;
        
        ListNode perv =  head;

        while(perv!=null){
           
           length++;
           perv=perv.next;

        }
        int position = length-n;
        int count=0;

        ListNode current = head;

        if (position==0){
            return head.next;
        }

        while(current!=null){
            count++;
            if(count==position){
               current.next=current.next.next;
            }
                           current=current.next;

            
        }

        return head;
    }
}
