class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        helper(1, n, k, ans,res);
        return res;
    }
     public void helper(int num, int tot, int k, List<Integer> ans,List<List<Integer>> res) {
        if (num == tot + 1) {
            if (ans.size() == k) {
                res.add(new ArrayList<>(ans));
            }
            return;
        }
    
        ans.add(num);
        helper(num + 1, tot, k, ans,res);
        ans.remove(ans.size() - 1);
        helper(num + 1, tot, k, ans,res);
    }
}