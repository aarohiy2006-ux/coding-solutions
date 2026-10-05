# Palindrome Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `head` of a singly linked list, return `true` *if it is a  **palindrome**  or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: head = [1,2,2,1]
Output: true

```

 **Example 2:** 

```
Input: head = [1,2]
Output: false

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [1, 105].
- 0 <= Node.val <= 9

 

 **Follow up:**  Could you do it in `O(n)` time and `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 67.67%)  
**Memory:** 95.2 MB (beats 32.47%)  
**Submitted:** 2026-10-05T19:25:29.506Z  

```java
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

```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-linked-list/)