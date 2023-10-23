class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int rem[]=nums.clone();
        if(k==nums.length)
        {
            return nums;
        }
        int h=k;
        Map<Integer,Integer> temp=new HashMap<>();
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0 && k!=0;i--)
        {
            if(temp.containsKey(nums[i]))
            {
                int e=temp.get(nums[i])+1;
                temp.put(nums[i],e);
                k--;
            }
            else
            {
                temp.put(nums[i],1);
                k--;
            }
            
               
        }
        int j=0;
        nums=new int[h];
        for(int i=0;i<rem.length && h!=0;i++)
        {
            if(temp.containsKey(rem[i]) && temp.get(rem[i])>0)
            {
                nums[j]=rem[i];
                j++;
                h--;
                int e=temp.get(rem[i])-1;
                temp.put(rem[i],e);
            }
        }
      
        return nums;
        
    }
}