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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        int[] preOrderIndex = {0};  // Using an array to keep track of preOrderIndex
        TreeNode ans = solve(preorder, inorder, preOrderIndex, 0, n - 1);
        return ans;
    }

    public TreeNode solve(int[] preorder, int[] inorder, int[] preOrderIndex, int inorderStart, int inorderEnd) {
        if (preOrderIndex[0] >= preorder.length || inorderStart > inorderEnd) {
            return null;
        }
        
        int element = preorder[preOrderIndex[0]];
        preOrderIndex[0]++;  // Increment preOrderIndex

        TreeNode root = new TreeNode(element);

        int position = findPosition(inorder, element, inorderStart, inorderEnd);

        root.left = solve(preorder, inorder, preOrderIndex, inorderStart, position - 1);
        root.right = solve(preorder, inorder, preOrderIndex, position + 1, inorderEnd);

        return root;
    }

    public int findPosition(int[] inorder, int element, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == element) {
                return i;
            }
        }
        return -1;
    }

}