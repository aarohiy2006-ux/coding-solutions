# Queue Fill and Empty

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**, implement the functions:
 **fillQ():** Enqueue all elements of the array into a queue and return the queue.
 **emptyQ():** Dequeue all elements from the queue and print them in a single line, separated by spaces, followed by a newline.

 **Example 1:** 

```
Input: arr[] = [1, 2, 3, 4, 5] 
Output: [1, 2, 3, 4, 5] 
```

```
Input: arr[] = [1, 6, 43, 1, 2, 0, 5]
Output: [1, 6, 43, 1, 2, 0, 5]
```

 **Constraints:** 
1 ≤ arr[i] ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T15:26:27.441Z  

```java
import java.util.*;

class Solution {
    public Queue<Integer> fillQ(int[] arr) {
        Queue<Integer> q = new LinkedList<>();

        for (int x : arr) {
            q.add(x);
        }

        return q;
    }

    public void emptyQ(Queue<Integer> q) {
        while (q.size() > 1) {
            System.out.print(q.remove() + " ");
        }

        if (!q.isEmpty()) {
            System.out.print(q.remove());
        }
         System.out.println();
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/queue-designer/1)