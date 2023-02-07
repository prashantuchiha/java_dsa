public class product_array_except_itself {

    static class Solution {
        public int[] productExceptSelf(int[] nums) {
            int arr[]=new int[nums.length];
            arr[0]=1;
            
            arr[nums.length-1]=1;
            for(int i=0;i<nums.length-1;i++){
                arr[i+1]=arr[i]*nums[i];
            }
            int a=1;
            for(int i=nums.length-1;i>0;i--){
                a=a*nums[i];
                arr[i-1]=arr[i-1]*a;
            }

            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }


            return arr;
        }
        
    }

    public static void main(String[] args) {
        int nums[]={-1,1,0,-3,3};
        Solution ob=new Solution();
        ob.productExceptSelf(nums);
    }
}
