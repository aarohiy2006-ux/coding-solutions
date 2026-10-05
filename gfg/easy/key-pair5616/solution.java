class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            int need=target-num;
            if(map.containsKey(need)){
                return true;
            
        }
        map.put(num,1);
        
        
          
    }
    return false;
}
}