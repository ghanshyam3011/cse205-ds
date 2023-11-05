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
    static class Pair{
        int level;
        Node node;
        
        public Pair(int level, Node node){
            this.level = level;
            this.node = node;
        }
    }
     //Function to return list containing elements of left view of binary tree.
    public List<Integer> rightSideView(TreeNode root)
    {
        
      Queue<Pair> q = new LinkedList<>();
      
      ArrayList<Integer> ans = new ArrayList<>();
      
      if (root == null) {
            return ans;
      }
      
      Map<Integer,Integer> map = new HashMap<>();
      
      q.add(new Pair(0,root));
      
      while(!q.isEmpty())
      {
          Pair curr = q.poll();
          Node nodey = curr.node;
          int level = curr.level;
          
          map.put(level,nodey.data);
          
          if(nodey.left!=null){
              q.add(new Pair(level+1,nodey.left));
          }
          if(nodey.right!=null){
              q.add(new Pair(level+1,nodey.right));
          }
      }
      for(int value: map.values()){
          ans.add(value);
      }
      
      return ans;
    }

    
}

    
   