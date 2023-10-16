class Solution {
    public static void merge(int[]arr, int s , int e){
        int mid =  (s+e)/2;
        int len1 = mid-s+1;
        int len2 = e-mid;

        int first[] = new int[len1];
        int second[] = new int[len2];


        // copying them 
        int mainInd = s;
        for(int i = 0 ; i<len1 ; i++){
            first[i] = arr[mainInd++];
        }

        mainInd = mid+1;
        for(int i = 0 ; i<len2; i++){
            second[i] = arr[mainInd++];
        }

        
        int ind1 = 0;
        int ind2 = 0;
        mainInd = s;

        // merge 2 sorted array
        while(ind1<len1 && ind2<len2)
        {
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

    public static void mergeSort(int[]arr, int s , int e){
        // base case 
        if(s>=e){
            return;
        }
        int mid  = (s+e)/2;

        // left part sorting by mergeSort
        mergeSort(arr,s,mid);

        // right part sorting by mergeSort  
        mergeSort(arr,mid+1,e);
        
        // partition and merge them
        merge(arr,s,e);

    }
    public int heightChecker(int[] heights) {
        int count = 0 ;
        int[] expected = Arrays.copyOf(heights, heights.length);
        mergeSort(expected,0,expected.length-1);
        for(int i = 0 ; i<heights.length; i++){
            if(expected[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}