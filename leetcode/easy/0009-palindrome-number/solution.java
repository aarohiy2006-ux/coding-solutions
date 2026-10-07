class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);

int[] arr = new int[str.length()];

for (int i = 0; i < str.length(); i++) {
    arr[i] = str.charAt(i) - '0';
}
       int left=0;
       int right=arr.length-1;
       while(left<right){
        if(arr[left]!=arr[right]){
            return false;
        }
        left++;
        right--;
       } 
       return true;
    }
}