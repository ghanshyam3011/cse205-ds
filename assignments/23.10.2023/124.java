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
    public int maxPathSum(TreeNode root) {
        int [] maxValue = new int[1];

        maxValue[0] = Integer.MIN_VALUE;
        maxPathDown(root, maxValue);

        return maxValue[0];
        
    }

    public static int maxPathDown(TreeNode root, int []maxValue){
        if(root == null)
         return 0;

        int lefty = Math.max(0, maxPathDown(root.left, maxValue));
        int righty = Math.max(0, maxPathDown(root.right, maxValue));

        maxValue[0] = Math.max(maxValue[0], root.val + lefty + righty);

        return root.val + Math.max(lefty, righty);
    }

}