class Solution {
    public int firstIndex(int arr[]) {
        return firstIndex(arr,0,arr.length-1);// code here
    }
    private int firstIndex(int[]arr,int low,int high){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==0){
            return firstIndex(arr,mid+1,high);
        }
       else {
           // arr[mid] == 1

           int result = firstIndex(arr, low, mid - 1);

           if (result == -1) {
               return mid;
           }

           return result;
       }
    }
}