class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i<nums.length ; i++){
            pq.add(nums[i]);
        }

        for(int i =1 ; i <= k ; i++){
            if(i==k) return pq.peek();
            pq.poll();
        }
        return 0;
    }
}