# At least Two Greater

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array arr of distinct elements, the task is to return an array of elements that have at least two greater elements.

 **Examples:** 

```
Input: arr[] = [2, 8, 7, 1, 5]
Output: [1, 2, 5] 
Explanation: Here we return an array contains 1, 2, 5 and we leave two greatest elements 7 & 8. 
```

```
Input: arr[] = [7, -2, 3, 4, 9, -1]
Output: [-2, -1, 3, 4]
Explanation:  Here we return an array contains -2,  -1,  3,  4 and we leave two greatest elements 7 & 9. 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T15:02:11.600Z  

```java
class Solution {
    public long[] findElements(long arr[]) {
        // code here
       Arrays.sort(arr);
        
        
        ArrayList<Long>ans=new ArrayList<>();
        for(int i = 0; i < arr.length - 2; i++) {
                    ans.add(arr[i]);
                }
        long[] result = new long[ans.size()];

        for(int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/at-least-two-greater-elements4625/1)