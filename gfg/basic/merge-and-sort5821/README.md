# Merge and Sort

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two arrays  **arr1[]** and  **arr2[]**, return the merged array in ascending order containing unique elements.

 **Examples:** 

```
Input: arr1[] = [11, 1, 8], arr2[] = [10, 11]
Output: [1, 8, 10, 11]
Explanation: The ouput array after merging both the arrays and removing duplicates is [1, 8, 10, 11]

```

```
Input: arr1[] = [7, 1, 5, 3, 9], arr2[]  = [8, 4, 3, 5, 2, 6]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9] 
```

 **Constraints:** 
1 ≤ arr1.size(), arr2.size() ≤ 104
0 ≤ arr1[i], arr2[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T15:01:09.619Z  

```java
class Solution {
    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        // code here
        
      int[] arr=new int[arr1.length+arr2.length];
      int k=0;
      for(int i=0;i<arr1.length;i++){
          arr[k]=arr1[i];
          k++;
      }
      for(int j=0;j<arr2.length;j++){
          arr[k]=arr2[j];
          k++;
      }
      Arrays.sort(arr);
      ArrayList<Integer>ans=new ArrayList<>();
      
      for(int i=0;i<arr.length;i++){
           if(i == 0 || arr[i] != arr[i - 1]){
      ans.add(arr[i]);}
         
      }
       
       return ans;
      
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/merge-and-sort5821/1)