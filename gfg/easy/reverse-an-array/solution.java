class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int [] temp=new int[arr.length];
        int j=0;
        int i=0;
        for(i=arr.length-1;i>=0;i--){
            temp[j]=arr[i];
            j++;
        }
        int k=0;
        
        for(k=0;k<arr.length;k++){
            arr[k]=temp[k];
            
        }
    }
}