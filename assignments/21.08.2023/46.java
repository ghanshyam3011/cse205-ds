class Solution {
    public void recurPermute(int nums[],List<List<Integer>>ans,List<Integer>temp,boolean[] flag){
        // base condition
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        // main     
        for(int i =0;i<nums.length;i++){
            if(!flag[i]){
                temp.add(nums[i]);
                flag[i]=true;
                recurPermute(nums,ans,temp,flag);
                temp.remove(temp.size()-1);
                flag[i] = false;
            }
        }
            
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean [] flag = new boolean[nums.length];
        recurPermute(nums,ans,temp,flag);
        return ans;
    }
}