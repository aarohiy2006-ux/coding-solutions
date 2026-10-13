/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        int data;
        Node left;
        Node rigth;
        ArrayList<Integer> ans=new ArrayList<>();
        preOrder(root,ans);
        return ans;
        
    }
    public void preOrder(Node root,ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        ans.add(root.data);
        preOrder(root.left,ans);
        preOrder(root.right,ans);
    
        
    }
}