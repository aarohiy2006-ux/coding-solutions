# Left and Right Sum Differences

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a  **0-indexed**  integer array `nums` of size `n`.

Define two arrays `leftSum` and `rightSum` where:

- leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
- rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.

Return an integer array `answer` of size `n` where `answer[i] = |leftSum[i] - rightSum[i]|`.

 

 **Example 1:** 

```
Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].

```

 **Example 2:** 

```
Input: nums = [1]
Output: [0]
Explanation: The array leftSum is [0] and the array rightSum is [0].
The array answer is [|0 - 0|] = [0].

```

 

 **Constraints:** 

- 1 <= nums.length <= 1000
- 1 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 98.73%)  
**Memory:** 46.1 MB (beats 93.41%)  
**Submitted:** 2026-10-24T14:00:00.036Z  

```java
class Solution {
    public int[] leftRightDifference(int[] nums) {
     int[] leftsum=new int[nums.length];
     int[] rightsum=new int[nums.length];
     int ans1=0;
    for(int i=0;i<nums.length;i++){
        leftsum[i]=ans1;
    ans1=ans1+nums[i];
    }
    int ans2=0;
    for(int i=nums.length-1;i>=0;i--){
    rightsum[i] = ans2;
    ans2=ans2+nums[i];
    }
    int[] ans3=new int[nums.length];
    for(int i=0;i<nums.length;i++){
        ans3[i] = Math.abs(leftsum[i] - rightsum[i]);
    }
    

    return ans3;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/left-and-right-sum-differences/)