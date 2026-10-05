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
    public boolean isPalindrome(ListNode head) {
        int count = 0;
ListNode temp = head;

while (temp != null) {
    count++;
    temp = temp.next;
}

int[] arr = new int[count];

temp = head;
int i = 0;

while (temp != null) {
    arr[i] = temp.val;
    i++;
    temp = temp.next;
}
for (i = 0; i < count / 2; i++) { 
    if (arr[i] != arr[count - 1 - i]) {

         return false; 
         } 
         
         }
         return true;
}
}
