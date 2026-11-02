class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int count;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int index=0;
        for(int num:nums){
            count= map.getOrDefault(num,0);
            if(count<k){
                nums[index++]=num;
                map.put(num,count+1);
                
                }
            
            }
        
     
     return Arrays.copyOf(nums,index);
    }
}