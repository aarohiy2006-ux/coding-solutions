# Single Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a  **non-empty**  array of integers `nums`, every element appears  *twice*  except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

 **Example 1:** 

 **Input:**  nums = [2,2,1]

 **Output:**  1

 **Example 2:** 

 **Input:**  nums = [4,1,2,1,2]

 **Output:**  4

 **Example 3:** 

 **Input:**  nums = [1]

 **Output:**  1

 

 **Constraints:** 

- 1 <= nums.length <= 3 * 104
- -3  *104 <= nums[i] <= 3*  104
- Each element in the array appears twice except for one element which appears only once.

## Solution

**Language:** Java  
**Runtime:** 18 ms (beats 9.13%)  
**Memory:** 46.4 MB (beats 91.61%)  
**Submitted:** 2026-11-03T18:13:05.946Z  

```java
class Solution {
    public int singleNumber(int[] nums) {

    HashMap<Integer,Integer> map=  new HashMap<>();
    for(int num:nums){
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for(int key : map.keySet()){
     if(map.get(key) == 1){
        return key;
     }
    }
     return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/single-number/)