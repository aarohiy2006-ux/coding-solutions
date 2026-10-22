/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
      TreeNode left;
      TreeNode right;
      int currentDiameter;
      int count=0;
      
       if (root == null) {
        return 0;
    }

      int leftheight=height(root.left);
      int rightheight=height(root.right);

    currentDiameter = leftheight + rightheight;

    int leftDiameter=diameterOfBinaryTree(root.left);
    int rightDiameter=diameterOfBinaryTree(root.right);

    return Math.max(currentDiameter,
           Math.max(leftDiameter, rightDiameter));

        
      }  
      public int height(TreeNode root) {
    if (root == null) {
        return 0;
    }

    return 1 + Math.max(height(root.left), height(root.right));
}
    }
