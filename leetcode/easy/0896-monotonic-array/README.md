# Monotonic Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

An array is  **monotonic**  if it is either monotone increasing or monotone decreasing.

An array `nums` is monotone increasing if for all `i <= j`, `nums[i] <= nums[j]`. An array `nums` is monotone decreasing if for all `i <= j`, `nums[i] >= nums[j]`.

Given an integer array `nums`, return `true` *if the given array is monotonic, or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: nums = [1,2,2,3]
Output: true

```

 **Example 2:** 

```
Input: nums = [6,5,4,4]
Output: true

```

 **Example 3:** 

```
Input: nums = [1,3,2]
Output: false

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -105 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 69.44%)  
**Memory:** 85.2 MB (beats 59.17%)  
**Submitted:** 2026-10-08T16:30:44.591Z  

```java
class Solution {
    public boolean isMonotonic(int[] nums) {

        boolean increasing=true;
        boolean decreasing =true;
       
    for(int i=1;i<nums.length;i++){
        if(nums[i]>nums[i-1]){
            decreasing =false;
            
        }
         if (nums[i] < nums[i - 1]){
            increasing =false;
         }
       
    }    
return increasing || decreasing;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/monotonic-array/)