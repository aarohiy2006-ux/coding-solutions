# Diameter of Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `root` of a binary tree, return  *the length of the  **diameter**  of the tree*.

The  **diameter**  of a binary tree is the  **length**  of the longest path between any two nodes in a tree. This path may or may not pass through the `root`.

The  **length**  of a path between two nodes is represented by the number of edges between them.

 

 **Example 1:** 

```
Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

```

 **Example 2:** 

```
Input: root = [1,2]
Output: 1

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 104].
- -100 <= Node.val <= 100

## Solution

**Language:** Java  
**Runtime:** 216 ms (beats 5.16%)  
**Memory:** 48.5 MB (beats 5.08%)  
**Submitted:** 2026-10-31T14:41:43.673Z  

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
      TreeNode left;
      TreeNode right;
      int currentDiameter;
      int count=0;
      
       if (root == null) {
        return 0;
    }

      int leftheight=height(root.left);
      int rightheight=height(root.right);

    currentDiameter = leftheight + rightheight;

    int leftDiameter=diameterOfBinaryTree(root.left);
    int rightDiameter=diameterOfBinaryTree(root.right);

    return Math.max(currentDiameter,
           Math.max(leftDiameter, rightDiameter));

        
      }  
      public int height(TreeNode root) {
    if (root == null) {
        return 0;
    }

    return 1 + Math.max(height(root.left), height(root.right));
}
    }

```

---

[View on LeetCode](https://leetcode.com/problems/diameter-of-binary-tree/)