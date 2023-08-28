class Solution {
    public void findCombination(int ind, int[] arr,int target,List<List<Integer>> res,List<Integer> temp){
        // base condition
        if(ind == arr.length){
            if(target == 0){
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        // main 
        // excluded
        findCombination(ind+1,arr,target,res,temp);

        
        // included
        if(arr[ind]<=target){
            temp.add(arr[ind]);
            findCombination(ind,arr,target-arr[ind],res,temp);
            temp.remove(temp.size()-1);
        }

        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        findCombination(0, candidates,target,res,temp);
        return res;
    }
    
}