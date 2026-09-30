# Replace all 0's with 5

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given an integer  **n**. You need to convert all zeroes of  **n**  to 5.

 **Examples:** 

```
Input: n = 1004
Output: 1554
Explanation: There are two zeroes in 1004 on replacing all zeroes with 5, the new number will be 1554.

```

```
Input: n = 121
Output: 121
Explanation: Since there are no zeroes in 121, the number remains as 121.
```

 **Constraints:** 
0 <= n <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T14:58:39.245Z  

```java
class Solution {
    public int convertFive(int n) {
        // code here
        int original=n;
        int count = 0;

        while(n > 0) {
            n = n / 10;
            count++;
        }
        
        int[] arr = new int[count];
               n = original; 

                int i = count - 1;
                
                
                if(n==0){
                    return 5;
                }
                

        while(n > 0) {
            arr[i] = n % 10;
            n = n / 10;
            i--;
        }
       for( i=0;i<arr.length;i++){
           if(arr[i]==0){
        arr[i]=5;
           }
       } 
       
       int ans =0;
       
       for(i=0;i<arr.length;i++){
           ans=ans*10+arr[i];
           
       }
           return ans;
       
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/replace-all-0s-with-5/1)