# Smallest Repeating K Times

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr**, the goal is to find out the smallest number that is repeated exactly ‘ **k** ’ times.

 **Note:**  If there is no such element then return  **-1**.

 **Example:** 

```
Input: arr[] = [2, 2, 1, 3, 1], k = 2
Output: 1
Explanation: 2 and 1 both appear exactly 2 times. Since we need to find the smallest, output is 1.
```

```
Input: arr[] = [3, 5, 3, 2], k = 1
Output:  2 
Explanation: 5 and 2 each appear exactly 1 time. Since we need the smallest, the output is 2.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T14:45:20.350Z  

```java
import java.util.*;
class Solution {
    public int findDuplicate(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int count=map.getOrDefault(arr[i],0);
            count++;
            map.put(arr[i], count);
            
        }
         int ans = Integer.MAX_VALUE;

                // Find the smallest element occurring exactly k times
                for (int key : map.keySet()) {
                    if (map.get(key) == k) {
                        ans = Math.min(ans, key);
                    }
                }

                if (ans == Integer.MAX_VALUE) {
                    return -1;
                }

                return ans;
            }
        }
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-number-repeating-k-times3239/1)