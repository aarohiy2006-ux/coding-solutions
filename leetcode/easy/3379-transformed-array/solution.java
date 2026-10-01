class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] rev=new int[n];
        for(int i=0;i<n;i++){
        rev[i]=nums[(i+nums[i]%n+n)%n];
        
    }
    return rev;
}
}