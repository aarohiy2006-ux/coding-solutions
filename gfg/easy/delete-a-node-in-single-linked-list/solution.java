/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        Node temp=head;
       int count=1;
       if(x==1){
           head=head.next;
       }
         while(temp!=null && count<x-1){
             temp=temp.next;
         count++;
         }
          if(temp!=null && temp.next!=null){
              temp.next=temp.next.next;
          }
       
       return head;
    }
    
}