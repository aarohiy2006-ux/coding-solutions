class Solution {
    public boolean divisorGame(int n) {
      int x=1;
      while(x<n && n%2==0) {
        n=n-x;
        return true;
      }
      return false;

    }
}