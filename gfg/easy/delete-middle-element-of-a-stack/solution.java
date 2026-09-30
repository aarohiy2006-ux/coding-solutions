class Solution {
    public void deleteMid(Stack<Integer> s,int k) {
       
        if(k==0){
            s.pop();
            return ;
        }// code here
        int top=s.pop();
        deleteMid(s,k-1);
        s.push(top);
        
        
    }
        
        public void deleteMid(Stack<Integer> s) {
        int k = s.size() / 2;
        deleteMid(s, k);
    }
}
