# Count Square Sum Triples

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A  **square triple**  `(a,b,c)` is a triple where `a`, `b`, and `c` are  **integers**  and `a2 + b2 = c2`.

Given an integer `n`, return  *the number of  **square triples**  such that* `1 <= a, b, c <= n`.

 

 **Example 1:** 

```
Input: n = 5
Output: 2
Explanation: The square triples are (3,4,5) and (4,3,5).

```

 **Example 2:** 

```
Input: n = 10
Output: 4
Explanation: The square triples are (3,4,5), (4,3,5), (6,8,10), and (8,6,10).

```

 

 **Constraints:** 

- 1 <= n <= 250

## Solution

**Language:** Java  
**Runtime:** 13 ms (beats 80.74%)  
**Memory:** 41.5 MB (beats 93.26%)  
**Submitted:** 2026-10-29T15:48:50.163Z  

```java
class Solution {
    public int countTriples(int n) {
    int count=0;
    for(int a=1;a<=n;a++){
        for(int b=1;b<=n;b++){
           int sum=a*a+b*b;
           int c=(int)Math.sqrt(sum); 
    
    if(c<=n && c*c==sum){
     count++;
            }
        }
    }
    
    return count;  
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-square-sum-triples/)