# Add Two Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two  **non-empty**  linked lists representing two non-negative integers. The digits are stored in  **reverse order**, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

 **Example 1:** 

```
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

```

 **Example 2:** 

```
Input: l1 = [0], l2 = [0]
Output: [0]

```

 **Example 3:** 

```
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

```

 

 **Constraints:** 

- The number of nodes in each linked list is in the range [1, 100].
- 0 <= Node.val <= 9
- It is guaranteed that the list represents a number that does not have leading zeros.

## Solution

**Language:** C  
**Runtime:** 5 ms (beats 9.75%)  
**Memory:** 13.5 MB (beats 54.02%)  
**Submitted:** 2026-09-30T15:43:14.277Z  

```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode* temp1=l1;
    struct ListNode*temp2=l2;

    struct ListNode*result=NULL;
    struct ListNode*tail=NULL;
    int carry=0;
    
    while(temp1 != NULL || temp2 != NULL || carry != 0){
        int x=0;
    int y=0;
    if(temp1!=NULL)
         x=temp1->val;
        
    
    if(temp2!=NULL)
        y=temp2->val;
    
    
    
        int sum= x + y+carry;
        carry=sum/10;
        sum=sum%10;
        
    
    
    struct ListNode*newNode=malloc(sizeof(struct ListNode));
newNode->val=sum;
newNode->next=NULL;

if (result == NULL) {
            result = newNode;
            tail = newNode;
}
else{
    tail->next=newNode;
    tail=newNode;
}

if(temp1!=NULL){
    temp1=temp1->next;
}
if(temp2!=NULL){
    temp2=temp2->next;
}
}


return result;
}
```

---

[View on LeetCode](https://leetcode.com/problems/add-two-numbers/)