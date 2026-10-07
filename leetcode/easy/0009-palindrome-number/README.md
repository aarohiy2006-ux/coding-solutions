# Palindrome Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `x`, return `true` if `x` is a  **palindrome**, and `false` otherwise.

 

 **Example 1:** 

```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

```

 **Example 2:** 

```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

```

 **Example 3:** 

```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

```

 

 **Constraints:** 

- -231 <= x <= 231 - 1

 

 **Follow up:**  Could you solve it without converting the integer to a string?

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 23.46%)  
**Memory:** 46.1 MB (beats 33.33%)  
**Submitted:** 2026-10-07T17:10:38.667Z  

```java
class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);

int[] arr = new int[str.length()];

for (int i = 0; i < str.length(); i++) {
    arr[i] = str.charAt(i) - '0';
}
       int left=0;
       int right=arr.length-1;
       while(left<right){
        if(arr[left]!=arr[right]){
            return false;
        }
        left++;
        right--;
       } 
       return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-number/)