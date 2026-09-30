class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++)
        if(arr[i]>largest){
            largest=arr[i];
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
         
         ArrayList<Integer>ans=new ArrayList<>();
         
         ans.add(smallest);
         ans.add(largest);
         
         return ans;
    }
}
