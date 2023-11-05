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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int x = maxDepth(root.left);
        int y = maxDepth(root.right);

        return Math.max(x,y)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {

        if(root == null) return 0;        

        int leftyD = diameterOfBinaryTree(root.left);
        int rightyD = diameterOfBinaryTree(root.right);

        int lefty = maxDepth(root.left);
        int righty = maxDepth(root.right);

        int diam = lefty+righty;

        return Math.max(diam,Math.max(leftyD,rightyD));
    }
}