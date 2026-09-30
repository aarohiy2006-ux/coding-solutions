# First 1 in a Sorted Binary Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a sorted array  **arr**  consisting of  **0** s and  **1** s. The task is to find the index (0-based indexing) of the first  **1**  in the given array.

 **NOTE:** If one is not present then, return -1.

 **Examples :** 

```
Input : arr[] = [0, 0, 0, 0, 0, 0, 1, 1, 1, 1]
Output : 6
Explanation: The index of first 1 in the array is 6.

```

```
Input : arr[] = [0, 0, 0, 0]
Output : -1
Explanation: 1's are not present in the array.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 1

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T15:16:31.819Z  

```java
class Solution {
    public int firstIndex(int arr[]) {
        return firstIndex(arr,0,arr.length-1);// code here
    }
    private int firstIndex(int[]arr,int low,int high){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==0){
            return firstIndex(arr,mid+1,high);
        }
       else {
           // arr[mid] == 1

           int result = firstIndex(arr, low, mid - 1);

           if (result == -1) {
               return mid;
           }

           return result;
       }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/index-of-first-1-in-a-sorted-array-of-0s-and-1s4048/1)