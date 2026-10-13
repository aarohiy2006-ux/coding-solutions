# Preorder Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given the root of a binary tree, return its preorder traversal.  A preorder traversal first visits the node, then visits the left child (including its entire subtree), and finally visits the right child (including its entire subtree).

 **Examples:** 

```
Input: root = [1, 4, N, 4, 2]
   
Output: [1, 4, 4, 2]
Explanation: The preorder traversal of the given binary tree is [1, 4, 4, 2]
```

```
Input: root = [6, 3, 2, N, 1, 2, N]
    
Output: [6, 3, 1, 2, 2] 
Explanation: The preorder traversal of the given binary tree is [6, 3, 1, 2, 2] 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T18:15:36.659Z  

```java
/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        int data;
        Node left;
        Node rigth;
        ArrayList<Integer> ans=new ArrayList<>();
        preOrder(root,ans);
        return ans;
        
    }
    public void preOrder(Node root,ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        ans.add(root.data);
        preOrder(root.left,ans);
        preOrder(root.right,ans);
    
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/preorder-traversal/1)