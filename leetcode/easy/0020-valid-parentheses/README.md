# Valid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

 

 **Example 1:** 

 **Input:**  s = "()"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "()[]{}"

 **Output:**  true

 **Example 3:** 

 **Input:**  s = "(]"

 **Output:**  false

 **Example 4:** 

 **Input:**  s = "([])"

 **Output:**  true

 **Example 5:** 

 **Input:**  s = "([)]"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of parentheses only '()[]{}'.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.92%)  
**Memory:** 43.2 MB (beats 71.92%)  
**Submitted:** 2026-10-05T13:53:16.791Z  

```java
class Solution {
    public boolean isValid(String s) {

        char[] stack = new char[s.length()];
    int top = -1;

    for (int i = 0; i<s.length(); i++) {
        char c = s.charAt(i);

        if (c == '(' || c == '[' || c == '{') {
            top++;
            stack[top] = c;
        }
        else {
            if (top == -1) {
                return false;
            }

            char topChar = stack[top];

            if ((c == ')' && topChar != '(') ||
                (c == ']' && topChar != '[') ||
                (c == '}' && topChar != '{')) {
                return false;
            }

            top--;
        }
    }

    return top == -1;
}   
        
    }

```

---

[View on LeetCode](https://leetcode.com/problems/valid-parentheses/)