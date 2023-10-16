class Solution {

    public static void merge(int[]arr,int s , int e){
        // middle 
        int mid = (s+e)/2;

        // partition 
        int len1 = mid-s+1;
        int len2= e-mid;
        
        // copy 
        int[] first = new int[len1];
        int[] second = new int[len2];

        int mainInd = s;
        for(int i = 0; i<len1 ; i++){
            first[i] = arr[mainInd++];
        }

        mainInd = mid+1;
        for(int i = 0; i<len2 ; i++){
            second[i] = arr[mainInd++];
        }

        //merge 2 sorted arrays
        int ind1 = 0;
        int ind2 = 0;
        mainInd = s;

        while(ind1<len1 && ind2<len2){
            if(first[ind1]<second[ind2]){
                arr[mainInd++] = first[ind1++];
            }
            else{
                arr[mainInd++] = second[ind2++];
            }
        }
        while(ind1<len1){
            arr[mainInd++] = first[ind1++];
        }
        while(ind2<len2){
            arr[mainInd++] = second[ind2++];
        }
    }
    public static void mergeSort(int[]arr,int s , int e){
        if(s>=e)return;
        int mid = (s+e)/2;

        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);

        merge(arr,s,e);

    }
    public int arrayPairSum(int[] nums) {

        // sort an array
        mergeSort(nums,0,nums.length-1);

        // sum of all odd indexed values
        int sum = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(i%2==0){
                sum += nums[i];
            }
        }
        return sum;
    }
}