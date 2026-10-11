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