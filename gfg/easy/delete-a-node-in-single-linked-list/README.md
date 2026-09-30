# Linked List Delete at Position

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the  **head** of a linked list and an integer  **x**, delete the node at position x and return the updated head of the linked list.

 **Note** : Positions use 1-based indexing.

 **Examples:** 

```
Input: x = 4,

Output: 1 -> 2 -> 3 -> 5
Explanation: After deleting the node at the 4th position, the linked list is as

```

```
Input: x = 6,

Output: 2 -> 5 -> 7 -> 8 -> 99
Explanation: After deleting the node at 6th position, the linked list is as

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T14:54:47.807Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1)