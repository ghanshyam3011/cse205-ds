class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        int[] arr = new int[2];
        for(int i = 1 ; i<=nums.length ; i++){
            if(!map.containsKey(i)) arr[1] =  i;
            else if(map.get(i)==2) arr[0] = i;
        }
        return arr;
    }
}