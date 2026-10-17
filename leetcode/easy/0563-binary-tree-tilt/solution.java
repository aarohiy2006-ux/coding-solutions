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
    int tilt=0;
    TreeNode left;
    TreeNode right;
    public int findTilt(TreeNode root) {
         calculateSum(root);
        return tilt;
        }

    public int calculateSum(TreeNode root) {
        if(root==null){
        return 0;
        }
        
        int leftsum=calculateSum(root.left);
        int rightsum=calculateSum(root.right);

        tilt +=Math.abs(leftsum -rightsum);

        return root.val+leftsum+rightsum;
        }
    }
