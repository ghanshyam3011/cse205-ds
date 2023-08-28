
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        generateSubsets(0, nums, ans, temp);
        return ans;
    }

    private void generateSubsets(int ind, int[] nums, List<List<Integer>> ans, List<Integer> temp) {
        ans.add(new ArrayList<>(temp)); 
        for (int i = ind; i < nums.length; i++) {
            if (i == ind || nums[i] != nums[i - 1]) {
                temp.add(nums[i]);
                generateSubsets(i + 1, nums, ans, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
