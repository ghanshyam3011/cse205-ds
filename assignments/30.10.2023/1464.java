class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i<nums.length ; i++){
            pq.add(nums[i]);
        }
        int a = pq.peek();
        pq.poll();
        int b = pq.peek();
        pq.poll();

        return (a-1)*(b-1);

    }
}