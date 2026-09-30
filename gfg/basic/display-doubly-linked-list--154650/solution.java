/* Structure of doubly linked list Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/
  class Solution {
      public List<List<Integer>> displayList(Node head) {

          List<Integer> forward = new ArrayList<>();
          List<Integer> backward = new ArrayList<>();

          Node temp = head;
          Node last = null;

         
          while (temp != null) {
              forward.add(temp.data);
              last = temp;
              temp = temp.next;
          }

          
          temp = last;

          while (temp != null) {
              backward.add(temp.data);
              temp = temp.prev;
          }

          List<List<Integer>> ans = new ArrayList<>();
          ans.add(forward);
          ans.add(backward);

          return ans;
      }
  }