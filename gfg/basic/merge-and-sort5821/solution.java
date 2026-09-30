class Solution {
    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        // code here
        
      int[] arr=new int[arr1.length+arr2.length];
      int k=0;
      for(int i=0;i<arr1.length;i++){
          arr[k]=arr1[i];
          k++;
      }
      for(int j=0;j<arr2.length;j++){
          arr[k]=arr2[j];
          k++;
      }
      Arrays.sort(arr);
      ArrayList<Integer>ans=new ArrayList<>();
      
      for(int i=0;i<arr.length;i++){
           if(i == 0 || arr[i] != arr[i - 1]){
      ans.add(arr[i]);}
         
      }
       
       return ans;
      
    }
}
