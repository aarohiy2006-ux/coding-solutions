# Highest and Lowest Frequencies

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array, the task is to find the difference between the highest occurrence and lowest occurrence of any numbers in an array. If only one type of element is present in the array return 0

 **Examples:** 

```
Input: arr[] = [1, 2, 2]
Output: 1
Explanation:  Lowest occurring element (1) occurs once. Highest occurring element (2) occurs 2 times
```

```
Input: arr[] = [7, 8, 4, 5, 4, 1, 1, 7, 7, 2, 5]
Output: 2
Explanation : Lowest occurring element (2) occurs once. Highest occurring element (7) occurs 3 times
```

 **Constraints:** 
1<= arr.size() <=106
1<= arr[i] <=106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T13:23:41.730Z  

```java
import java.util.*;

class Solution {
    public int findDiff(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
        int count=map.getOrDefault(arr[i],0);
        count++;
        map.put(arr[i], count);}
        
        
        
        int min= Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int key : map.keySet()){
           int freq=map.get(key);
           
           if(freq<min){
               min=freq;
           }
           if(freq>max){
               max=freq;
           }
        }
           
              return max-min; 
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/difference-between-highest-and-lowest-occurrence4613/1)