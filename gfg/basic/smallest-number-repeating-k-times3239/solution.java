import java.util.*;
class Solution {
    public int findDuplicate(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int count=map.getOrDefault(arr[i],0);
            count++;
            map.put(arr[i], count);
            
        }
         int ans = Integer.MAX_VALUE;

                // Find the smallest element occurring exactly k times
                for (int key : map.keySet()) {
                    if (map.get(key) == k) {
                        ans = Math.min(ans, key);
                    }
                }

                if (ans == Integer.MAX_VALUE) {
                    return -1;
                }

                return ans;
            }
        }