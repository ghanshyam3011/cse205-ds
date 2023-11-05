class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i<stones.length ; i++){
            pq.add(stones[i]);
        }
        while(pq.size()>=0)
        {
            if(pq.size()==1) return pq.peek();
            else if(pq.size()==0) return 0;
            else{
                int a = pq.peek();
                pq.poll();
                int b = pq.peek();
                pq.poll();
                if(a!=b) pq.add(a-b); 

            }
        }
        return pq.peek();
    }
}