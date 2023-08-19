class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), res);
        return res;
    }
    public void generateSubsets(int ind, int arr[], List<Integer> curr, List<List<Integer>> res){
    res.add(new ArrayList(curr));
    for(int i = ind; i < arr.length; i++){
        curr.add(arr[i]);
        generateSubsets(i+1, arr, curr, res);
        curr.remove(curr.size()-1);
    }
}
}