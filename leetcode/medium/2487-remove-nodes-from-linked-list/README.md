# Remove Nodes From Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given the `head` of a linked list.

Remove every node which has a node with a greater value anywhere to the right side of it.

Return  *the* `head` *of the modified linked list.* 

 

 **Example 1:** 

```
Input: head = [5,2,13,3,8]
Output: [13,8]
Explanation: The nodes that should be removed are 5, 2 and 3.
- Node 13 is to the right of node 5.
- Node 13 is to the right of node 2.
- Node 8 is to the right of node 3.

```

 **Example 2:** 

```
Input: head = [1,1,1,1]
Output: [1,1,1,1]
Explanation: Every node has value 1, so no nodes are removed.

```

 

 **Constraints:** 

- The number of the nodes in the given list is in the range [1, 105].
- 1 <= Node.val <= 105

## Solution

**Language:** Java  
**Runtime:** 73 ms (beats 18.30%)  
**Memory:** 134.4 MB (beats 48.12%)  
**Submitted:** 2026-10-07T14:34:10.598Z  

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
    public ListNode removeNodes(ListNode head) {
        ListNode temp=head;
       Stack<ListNode> stack=new Stack<>();
       while(temp!=null){
        
       while(!stack.isEmpty() && stack.peek().val<temp.val){
        stack.pop();

       }
       stack.push(temp);
       temp=temp.next;}

       ListNode ans=null;
       while(!stack.isEmpty()){
        ListNode node=stack.pop();
        node.next=ans;
        ans=node;
       }
       return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-nodes-from-linked-list/)