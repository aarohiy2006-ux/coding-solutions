# Postorder Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given the  **root** of a Binary Tree, return its Postorder Traversal.

 **Note:** A postorder traversal first visits the left child (including its entire subtree), then visits the right child (including its entire subtree), and finally visits the node itself.

 **Examples:** 

```
Input: root = [19, 10, 8, 11, 13]

Output: [11, 13, 10, 8, 19]
Explanation: The postorder traversal of the given binary tree is [11, 13, 10, 8, 19].
```

```
Input: root = [11, 15, N, 7]
 
Output: [7, 15, 11]
Explanation: The postorder traversal of the given binary tree is [7, 15, 11].
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T18:36:03.112Z  

```java
/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        int data;
        Node left;
        Node right;
         ArrayList<Integer> ans=new ArrayList<>();
         postOrder(root,ans);
         
         return ans;
    }
    public void postOrder(Node root,ArrayList<Integer> ans){
        if(root==null){
            return ;
        }
        postOrder(root.left,ans);
        postOrder(root.right,ans);
        ans.add(root.data);
    
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/postorder-traversal/1)