class Solution {
    public int search(int[] nums, int target) {
        int k=0;
        
        if(nums[0]<nums[nums.length-1]){
            for(int i=0;i<nums.length;i++){
                if(target==nums[i]){
                    return i;
                }
            }
            return -1;
        }
        
        
        for(int i=0;i<nums.length/2;i++){
            if(nums[i]<nums[nums.length-i-1]){
                k=nums.length-i-1;
                break;
            }else{
                k=nums.length-1-i;
            }
        }
        
        
        if(target>nums[nums.length-1]){
            for(int i=0;i<k;i++){
                if(nums[i]==target){
                    return i;
                }else{continue;}
            }
            return -1;
        }else{
            for(int i=nums.length-1;i>=k;i--){
                 if(nums[i]==target){
                     return i;
                 }
            }
            return -1;
        }
        
        
        
    }
}