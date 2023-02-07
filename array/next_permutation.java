import java.util.*;

class Solution {
    public void nextPermutation(int[] nums) {
        int a = 0;
        int b = -1;
        int n = nums.length;
        
        if(n==1){
            System.out.print(nums[0]);
        }
        else if (nums[n - 2] < nums[n - 1]) {
            a = nums[n - 2];
            nums[n - 2] = nums[n - 1];
            nums[n - 1] = a;
        } else {
            for (int i = n - 1; i > 0; i--) {
                if (nums[i] <= nums[i - 1]) {
                    
                    continue;
                    
                } else {
                    b = i - 1;
                    break;
                }
                // if(nums[i]>nums[i-1]){
                //     b=i-1;
                //     break;
                // }

            }
        
        

        if (b == -1) {
            Arrays.sort(nums);
            for (int i = 0; i < n; i++) {
                System.out.print(nums[i] + " ");
            }
        } else {
        int arr[] = Arrays.copyOfRange(nums, b, n);
        Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= nums[b]) {
                    continue;
                } else {
                    nums[b] = arr[i];
                    arr[i] = arr[0];
                    break;
                    // int arr1[] = Arrays.copyOfRange(arr, 1, arr.length);
                    // Arrays.sort(arr1);

                }

            }
        int arr1[] = Arrays.copyOfRange(arr, 1, arr.length);
        Arrays.sort(arr1);
        for (int i = b + 1; i < arr1.length + 1+b; i++) {
            nums[i] = arr1[i - b - 1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

    }




    // public static void main(String[] args) {
    //     int arr[]={1,2,3};
    //     Solution ob=new Solution();
    //     ob.nextPermutation(arr);
    // }

    

}