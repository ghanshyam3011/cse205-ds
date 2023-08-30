class Solution {
    public int findKthPositive(int[] arr, int k) {
        // int [] arr2 = new int[arr.length+k];
        // int j =0;
        // for(int i=1;i<arr.length;i++){
        //     if(j<arr2.length && i==arr[j]){
        //         j++;

        //         continue;
        //     }
        //     arr2[i] = i; 
        // }
        // return arr2[k-1];
        
        int missingCount = 0;
        int currentNumber = 1;
        int i = 0;
        
        while (missingCount < k) {
            if (i < arr.length && arr[i] == currentNumber) {
                i++;
            } else {
                missingCount++;
            }
            
            if (missingCount == k) {
                return currentNumber;
            }
            
            currentNumber++;
        }
        
        return -1; 
    }
}