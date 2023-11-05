class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
        int n = score.length;
        String[] arr = new String[n];
        int k = 1; 
        for(int i = 0; i <n ; i++){
            pq.poll();
            if(k==1) arr[i] = "Gold Medal";
            else if(k==2) arr[i]= "Silver Medal";
            else if(k==3) arr[i]= "Bronze Medal";
            else{
                arr[i] = String.valueOf(i+1);
            }
            k++;
        }
        return arr;

    }
}