class Solution {
     public static void quickSort(int[] arr , int s , int e){
        //base case
        if(s >= e)
            return;

        //take the partition
        int p = partition(arr , s , e);

        //left part sort
        quickSort(arr , s , p - 1);

        //right part sort
        quickSort(arr , p + 1 , e);

    }

    public static int partition(int[] arr , int s , int e){

        int pivot = arr[s];
        int count = 0;
        //count of elements smaller than pivot element
        for(int i = s + 1; i <= e; i++){
            if(arr[i] <= pivot)
                count++;
        }

        int pivotIdx = s + count;

        //put pivot element at correct position
        int temp = pivot;
        arr[s] = arr[pivotIdx];
        arr[pivotIdx] = temp;

        int sIdx = s;
        int eIdx = e;

        while(sIdx < pivotIdx && eIdx > pivotIdx){

            
            while(arr[sIdx] <= pivot){
                sIdx++;
            }
        
            while(arr[eIdx] > pivot){
                eIdx--;
            }
            //swap the values if found
            if(sIdx < pivotIdx && eIdx > pivotIdx){
                temp = arr[sIdx];
                arr[sIdx] = arr[eIdx];
                arr[eIdx] = temp;

                sIdx++;
                eIdx--;
            }
        }
        return pivotIdx;
    }
    public void sortColors(int[] nums){
        // for(int i = 0 ; i<nums.length ; i++){ // round
        //     for(int j = 0; j<nums.length-i-1 ; j++){ // iteration
        //         if(nums[j]>nums[j+1]){
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //         }
        //     }
        // }
        quickSort(nums,0,nums.length-1);
    }
}