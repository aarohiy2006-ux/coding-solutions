import java.util.Stack;
class Solution {
    public void reverseArray(int[] arr) {
        // code here
       Stack<Integer>stack=new Stack<>();
       for(int i=0;i<arr.length;i++){
           stack.push(arr[i]);
       }
       for(int i = 0; i < arr.length; i++) {
           arr[i] = stack.pop();
       }
       
    }
}
