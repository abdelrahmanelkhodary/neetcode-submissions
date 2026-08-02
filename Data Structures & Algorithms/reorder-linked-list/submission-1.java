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
    public void reorderList(ListNode head) {

        ListNode slow =head;  
        ListNode fast = head;

        

        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //slow ---> mid 

        ListNode secondList = slow.next; //first element in the second half
            //for reversing to save the nextNode 
        ListNode prev = null;                   
        slow.next=null;

            //reversing the second NodeList
        while(secondList!=null){
             ListNode current= secondList.next;
            secondList.next=prev;
            prev=secondList;
            secondList=current;

            
        }
        //head is the startNode of the first Node
        //prev is the startNode of the reverse Node

        //concatinating the twoNodeList 

        
        while(prev!=null&&head!=null){
             ListNode answer1=head.next;
            ListNode answer2=prev.next;
            head.next=prev;
            prev.next=answer1;

            head=answer1;
            prev=answer2;

         
        }
      

    }
}




