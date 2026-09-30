# Reverse Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `head` of a singly linked list, reverse the list, and return  *the reversed list*.

 

 **Example 1:** 

```
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

```

 **Example 2:** 

```
Input: head = [1,2]
Output: [2,1]

```

 **Example 3:** 

```
Input: head = []
Output: []

```

 

 **Constraints:** 

- The number of nodes in the list is the range [0, 5000].
- -5000 <= Node.val <= 5000

 

 **Follow up:**  A linked list can be reversed either iteratively or recursively. Could you implement both?

## Solution

**Language:** C  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 11.3 MB (beats 66.81%)  
**Submitted:** 2026-09-30T15:47:25.120Z  

```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

   struct ListNode* reverseList(struct ListNode* head) {
   struct ListNode*dummy=malloc(sizeof(struct ListNode));
   dummy->next=NULL;
   while(head!=NULL){
    struct ListNode*next=head->next;
    head->next=dummy->next;
    dummy->next=head;
   head=next;
   }
   
   
   struct ListNode* result = dummy->next;
    free(dummy);
    return(result);
   }

```

---

[View on LeetCode](https://leetcode.com/problems/reverse-linked-list/)