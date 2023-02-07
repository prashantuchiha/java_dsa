class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return nums[i+1];
            }
        }
        return 0;
    }
}


class Solution {
    public int findMin(int[] nums) {
   int low=0;
        int high=nums.length-1;
        int mid=-1;
        while(low<=high){
            if(nums[low]>nums[high]){
                mid=(low+high)/2;
                if(nums[mid]>=nums[low]){
                    low=mid+1;
                }else{
                    high=mid;
                }
            }else{
                return nums[low];
            }
        }
        return -1;
    }
}