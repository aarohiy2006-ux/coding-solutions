# Reverse a Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the  **head** of a singly linked list. Reverse the linked list and return the head of the reversed list.

 **Examples:** 

```
Input:

Output: 4 -> 3 -> 2 -> 1
Explanation: After reversing the linked list

```

```
Input: 

Output: 8 -> 9 -> 10 -> 7 -> 2
Explanation: After reversing the linked list

```

```
Input: 

Output: 8
Explanation:

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T15:20:06.281Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1)