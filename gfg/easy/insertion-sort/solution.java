class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        for(int i=0;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                int min=j+1;
                if(arr[j]>arr[min]){
                    int temp=arr[j];
                    arr[j]=arr[min];
                    arr[min]=temp;
                    
                }
            }
        }
        
        
    }
}