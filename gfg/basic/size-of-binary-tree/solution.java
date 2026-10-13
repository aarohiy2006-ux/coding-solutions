/*
Definition for Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public int getSize(Node root) {
        // code here
        int data;
        Node left;
        Node right;
        int ans;
        if(root==null){
            return 0;
            
        }
        
         ans=1+getSize(root.left)+getSize(root.right);
        
        return ans;
    }
}