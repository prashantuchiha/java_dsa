class Solution {
    public boolean containsDuplicate(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    x=1;
                }
                    
                
            }
        }
        
         if(x==1){
            return true;
    }else{
    return false;
    }
        
        }
    
   
}

////////////////////////////////////////////



class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        
         MergeSort ob = new MergeSort();
        ob.sort(nums, 0, nums.length - 1);
        
        
        // int z=0;
         int x=0;
        // int n=nums.length;
        // while(n>0){
        //     for(int i=0;i<n-1;i++){
        //         if(nums[i]>nums[i+1]){
        //             z=nums[i+1];
        //             nums[i+1]=nums[i];
        //             nums[i]=z;
        //         }
        //     }
        //     n--;
        // }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                x=1;
                break;
            }
        }
        if(x==1){
            return true;
        }else{
            return false;
        }
    }
}



class MergeSort 
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
  
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
  
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
  
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
} 







////////////////////////////////////////////////////////////




import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> hash_Set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            hash_Set.add(nums[i]);
        }
        if(hash_Set.size()!=nums.length){
            return true;
        }else{return false;}
        
      
    }
}
