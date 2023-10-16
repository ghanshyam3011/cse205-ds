class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        Comparator<Integer> reverseComparator = Collections.reverseOrder();
        PriorityQueue<Integer> pq = new PriorityQueue<>(reverseComparator);
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            
        } 
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            
            Integer value = entry.getValue();
            pq.add(value);
        }
        int sum=0;
        int count=0;

        int len = arr.length;

        while(sum<len/2 && !pq.isEmpty()){
            int ele = pq.poll();
            sum=sum+ele;
            
            count++;
        } 
        return count;    
    }
}