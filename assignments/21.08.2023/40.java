class Solution {
    public int combinationSum2(int[] arr, int tar, int idx, List<Integer> temp, List<List<Integer>> res) {
        if (tar == 0) {
            ArrayList<Integer> base = new ArrayList<>(temp);
            res.add(base);
            return 1;
        }
        boolean[] visited = new boolean[50];
        int count = 0;
        for (int i = idx; i < arr.length; ++i) {
            if (!visited[arr[i]] && tar - arr[i] >= 0) {
                
                visited[arr[i]] = true;
                
                temp.add(arr[i]);
                count += combinationSum2(arr, tar - arr[i], i + 1, temp, res);
                temp.remove(temp.size() - 1);
            }
        }
        return count;
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        Arrays.sort(candidates);
        
        combinationSum2(candidates, target, 0, temp, res);
        return res;
    }
}