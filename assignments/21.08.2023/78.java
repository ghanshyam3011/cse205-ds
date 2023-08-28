class Solution
{
    public void generateSubsets(int ind,int []nums,List<List<Integer>>ans, List<Integer> temp){
        // base condition

        if(ind ==nums.length){
            ans.add(new ArrayList(temp));
            return;
        }
        // main logic

        // included
        temp.add(nums[ind]);
        generateSubsets(ind+1,nums,ans,temp);
        temp.remove(temp.size()-1);
        // exluded
        generateSubsets(ind+1,nums,ans,temp);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        generateSubsets(0,nums,ans,temp);
        return ans;
    }
    
    
}