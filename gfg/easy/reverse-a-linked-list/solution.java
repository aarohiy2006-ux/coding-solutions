/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        Node dummy=null;
        while(head!=null){
            
            Node next=head.next;
            head.next=dummy;
            dummy=head;
            head=next;
        }// code here
        
       return dummy;
    }
    
}