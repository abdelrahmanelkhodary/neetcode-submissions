/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        HashMap<Node,Node> map = new HashMap<>();

        Node current = head ;
        Node prev=head;

         
         

        if(head==null){    
            return null;
        }
         
        // need to save the start of the copy to return copy  pointer at the end
        while(current!=null){
            Node copy = new Node(current.val);
            map.put(current, copy);
            current=current.next;
        }
        Node copyPointer=map.get(prev);
        

        while(prev!=null){
            Node copy=map.get(prev);
            copy.next=map.get(prev.next);
            copy.random=map.get(prev.random);
            prev=prev.next;
        }
       
            return copyPointer;
    }
}
