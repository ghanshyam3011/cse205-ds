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
    public int minimumSum(int num)
    {
        int[] dig = new int[4]; // For each digit
        int cur = 0;
        while(num > 0) // Getting each digit
        {
            dig[cur++] = num % 10;
            num /= 10;
        }
        // Arrays.sort(dig); // Ascending order
        mergeSort(dig,0,dig.length-1);
        int num1 = dig[0] * 10 + dig[2]; // 1st and 3rd digit
        int num2 = dig[1] * 10 + dig[3]; // 2nd and 4th digit
        return num1 + num2;
    }

}