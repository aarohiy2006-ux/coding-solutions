# Linked List Components

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given the `head` of a linked list containing unique integer values and an integer array `nums` that is a subset of the linked list values.

Return the number of  **connected**   **components**  in `nums`. A connected component is a non-empty, maximal sequence of  **consecutive**  nodes in the linked list such that every node's value belongs to nums.

 

 **Example 1:** 

```
Input: head = [0,1,2,3], nums = [0,1,3]
Output: 2
Explanation: 0 and 1 are connected, so [0, 1] and [3] are the two connected components.

```

 **Example 2:** 

```
Input: head = [0,1,2,3,4], nums = [0,3,1,4]
Output: 2
Explanation: 0 and 1 are connected, 3 and 4 are connected, so [0, 1] and [3, 4] are the two connected components.

```

 

 **Constraints:** 

- The number of nodes in the linked list is n.
- 1 <= n <= 104
- 0 <= Node.val < n
- All the values Node.val are unique.
- 1 <= nums.length <= n
- 0 <= nums[i] < n
- All the values of nums are unique.

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 80.91%)  
**Memory:** 46.9 MB (beats 93.92%)  
**Submitted:** 2026-10-05T10:43:18.226Z  

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
 import java.util.HashSet;
class Solution {
    public int numComponents(ListNode head, int[] nums) {
     int count =0;
    ListNode temp=head;
     HashSet<Integer> set = new HashSet<>();
     for(int num:nums){
        set.add(num);
     } 
     if(head==null){
        count=0;
     }
     while(temp!=null){
       if(set.contains(temp.val)){
        if(temp.next==null || !set.contains(temp.next.val)){
            count++;
        }
       } 
       temp=temp.next;
     } 
     return count; 
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/linked-list-components/)