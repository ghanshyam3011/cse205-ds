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
    static List<Integer> list = new ArrayList<Integer>();
    public static void inOrder(TreeNode root){
        if(root ==  null) return;
        
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        // left --> Root --> right
        list = new ArrayList<Integer>();
        inOrder(root);
        return list;
    }
}