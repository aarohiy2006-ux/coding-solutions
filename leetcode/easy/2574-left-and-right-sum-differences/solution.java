class Solution {
    public int[] leftRightDifference(int[] nums) {
     int[] leftsum=new int[nums.length];
     int[] rightsum=new int[nums.length];
     int ans1=0;
    for(int i=0;i<nums.length;i++){
        leftsum[i]=ans1;
    ans1=ans1+nums[i];
    }
    int ans2=0;
    for(int i=nums.length-1;i>=0;i--){
    rightsum[i] = ans2;
    ans2=ans2+nums[i];
    }
    int[] ans3=new int[nums.length];
    for(int i=0;i<nums.length;i++){
        ans3[i] = Math.abs(leftsum[i] - rightsum[i]);
    }
    

    return ans3;
    }
}