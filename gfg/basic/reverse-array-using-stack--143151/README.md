# Reverse Array Using Stack

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**, reverse the array elements in-place by using a  **stack**.

 **Examples :** 

```
Input: arr[] = [1, 2, 3, 4, 5]
Output: 5 4 3 2 1
Explanation: After the reverse, array will look like [5, 4, 3, 2, 1].
```

```
Input: arr[] = [1]
Output: 1
Explanation: After the reverse, array will look like [1].
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T15:24:00.139Z  

```java
import java.util.Stack;
class Solution {
    public void reverseArray(int[] arr) {
        // code here
       Stack<Integer>stack=new Stack<>();
       for(int i=0;i<arr.length;i++){
           stack.push(arr[i]);
       }
       for(int i = 0; i < arr.length; i++) {
           arr[i] = stack.pop();
       }
       
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-array-using-stack--143151/1)