class Solution {
    public boolean pairWiseConsecutive(Stack<Integer> st) {
        int second;
        int first; 
    if(st.size()%2!=0){
        st.pop();
    }
      while(st.size() > 1) {
       first = st.pop();   
       second = st.pop(); 

     if (Math.abs(first - second) != 1) {
             return false;
         }
     }
     return true;
}
    
}