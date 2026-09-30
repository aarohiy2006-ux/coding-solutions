/* structure of link list node
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public boolean isEven(Node head) {
          int count=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        if(count%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}