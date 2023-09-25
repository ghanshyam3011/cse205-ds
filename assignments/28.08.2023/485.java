import java.math.*;
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int result = 0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                result = Math.max(result,count);
                count= 0;
            }
            else
            {
                count++;
            }

        } 
        return Math.max(result,count);  
    }
}
