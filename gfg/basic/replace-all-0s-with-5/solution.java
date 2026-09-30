class Solution {
    public int convertFive(int n) {
        // code here
        int original=n;
        int count = 0;

        while(n > 0) {
            n = n / 10;
            count++;
        }
        
        int[] arr = new int[count];
               n = original; 

                int i = count - 1;
                
                
                if(n==0){
                    return 5;
                }
                

        while(n > 0) {
            arr[i] = n % 10;
            n = n / 10;
            i--;
        }
       for( i=0;i<arr.length;i++){
           if(arr[i]==0){
        arr[i]=5;
           }
       } 
       
       int ans =0;
       
       for(i=0;i<arr.length;i++){
           ans=ans*10+arr[i];
           
       }
           return ans;
       
    }
}