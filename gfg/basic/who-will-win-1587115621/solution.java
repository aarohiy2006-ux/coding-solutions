class Solution {
    public boolean binarySearch(int[] arr, int k) {
        return binarySearch(arr, k, 0, arr.length - 1);}
        
        private boolean binarySearch(int[] arr, int k, int low, int high){
         // code here
        if(low>high){
            return false;
        }
        int mid=(low+high)/2;
        if(k==arr[mid]){
            return true;
        }
        else if(k<arr[mid]){
         return binarySearch(arr,k,low,mid-1);
        }
        else{
        return binarySearch(arr,k,mid+1,high) ;  
        }
    }
}