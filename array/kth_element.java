class kth_element{
          static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
      
    static int partition(int[] nums, int low, int high)
    {
      int pivotnum=low;
      int pivot=high;
      for(int i=low;i<high;i++){
        if(nums[i]<nums[pivot]){
            swap(nums,i,pivotnum);
            pivotnum++;
        }
      }
      swap(nums,pivot,pivotnum);
      return pivotnum;





    }

    static int quickSelect(int[] nums, int low, int high,int k)
    {
      int pivot=high;
      int n=nums.length;

        while(low<=high){

           
            pivot=partition(nums,low,high);
            if(pivot==k-1){
                return nums[pivot];
            }else if(pivot>k-1){
                high=pivot-1;
            }
            else{
                low=pivot+1;
                
            }

        }

        return -1;

    }
    
// }
//     class Solution {

        public static void main(String args[]){
            int nums[]={3,2,1,5,6,4};
            int k=2;
            System.out.print(quickSelect(nums,0,nums.length-1,k));

        }
        
    }

