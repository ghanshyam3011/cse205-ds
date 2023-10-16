class Solution {
    public static void merge(int arr[], int s , int e){
        // partition
        int mid = (s+e)/2;
        int len1 = mid - s + 1;
        int len2 = e-mid;

        int[] first = new int[len1];
        int[] second = new int[len2];

        int mainInd = s;
        for(int i = 0 ; i<len1 ; i++){
            first[i] = arr[mainInd++];
        }
        mainInd = mid+1;
        for(int i = 0 ; i<len2 ; i++){
            second[i] = arr[mainInd++];
        }

        // merge 2 sorted array
        int ind1 = 0;
        int ind2 = 0;
        mainInd = s;
        while(ind1 < len1 && ind2 < len2 ){
            if(first[ind1]< second [ind2]){
                arr[mainInd++] = first[ind1++];
            }
            else{
                arr[mainInd++] = second[ind2++];
            }
        }
        while(ind1 < len1){
            arr[mainInd++] = first[ind1++];
        }
        while(ind2 < len2){
            arr[mainInd++] = second[ind2++];
        }
    }

    public static void mergeSort(int arr[], int s , int e){
        // base condition
        if(s>=e){
            return;
        }
        int mid = (s+e)/2;
        // mergesort left and right 
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);

        // merge them
        merge(arr,s,e);
    }
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] ans = new int[arr1.length];
        int k = 0;
        for(int i = 0 ; i< arr2.length ; i++){
            for(int j =0 ; j < arr1.length ; j++){
                if(k<arr1.length && arr2[i]==arr1[j]){
                    ans[k++] = arr1[j];
                    arr1[j] = -1;
                }
            }
        }
        mergeSort(arr1,0,arr1.length-1);
        for(int i =0 ; i<arr1.length ; i++){
            if(k<arr1.length && arr1[i]!=-1){
                ans[k++] = arr1[i];
            }
        }
        return ans;
    }
}