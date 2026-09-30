# Remove Linked List Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `head` of a linked list and an integer `val`, remove all the nodes of the linked list that has `Node.val == val`, and return  *the new head*.

 

 **Example 1:** 

```
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

```

 **Example 2:** 

```
Input: head = [], val = 1
Output: []

```

 **Example 3:** 

```
Input: head = [7,7,7,7], val = 7
Output: []

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 104].
- 1 <= Node.val <= 50
- 0 <= val <= 50

## Solution

**Language:** C  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 13.2 MB (beats 57.32%)  
**Submitted:** 2026-09-30T15:47:12.246Z  

```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    
    while(head!=NULL && head->val==val){
        head=head->next;
        
    }
    
   struct ListNode*temp=head;
   
while(temp!=NULL && temp->next!=NULL){
    if(temp->next->val==val){
temp->next=temp->next->next;
    }
    else{
        temp=temp->next;
    }
}
   return head;
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-linked-list-elements/)