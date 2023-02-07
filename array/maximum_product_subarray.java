import java.util.Arrays;

public class maximum_product_subarray {
    class Solution {
        public int maxProduct(int[] nums) {
            int sum=1;
            int min=Integer.MIN_VALUE;
            int a=0;
            int ans=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<0){
                    min=Integer.max(min, nums[i]);
                }
                if(nums[i]==0){
                    if(a==1 && sum<0){
                        sum=0;
                        ans=Integer.max(ans, sum);

                    }else if(sum<0){
                        sum=sum/min;
                        ans=Integer.max(ans, sum);
                    }
                    a=0;
                    sum=1;
                }
                sum=sum*nums[i];
                a+=1;
            }
            if(sum<0){
                sum=sum/min;
                ans=Integer.max(ans,sum);
            }
            return ans;
            
        }
    }
}


import java.util.Arrays;

class Solution {
        public int maxProduct(int[] nums) {
            
            if(nums.length==1){
               
                    return nums[0];
                
            }
           int a=nums[0];
            int b=1;
            int c=1;
            int arr[]=new int[nums.length];
            // arr[0]=1;
            for(int i=1;i<nums.length;i++){
                a=a*nums[i];
                if(a<=0){
                    b=nums[i];
                    arr[i]=b;
                }
                arr[i]=a;
                if(a<=0){
                    b=nums[i];
                    arr[i]=b;
                }
                
            }
            a=nums[nums.length-1];
            
            if(nums[nums.length-1]>arr[nums.length-1]){
                   arr[nums.length-1]=nums[nums.length-1]; 
            }
            
            
            
            
            for(int i=nums.length-2;i>0;i--){
                if(arr[i]<a){
                    arr[i]=a;
                }
                if(arr[i]<nums[i]){
                    arr[i]=nums[i];
                }
                a=a*nums[i];
            }
                                         
               Arrays.sort(arr);  
                return arr[nums.length-1];
            
        }
    }
      









    import java.util.Arrays;

class Solution {
        public int maxProduct(int[] nums) {
           int a=nums[0];
            int b=1;
            int c=1;
            int maxsofar=a;
            int max1=a;
            int arr[]=new int[nums.length];
            arr[0]=nums[0];
           for(int i=1;i<nums.length;i++){
               a*=nums[i];
                if(a==0){
                      a=nums[i];
                  }
               maxsofar=Integer.max(a,nums[i]);
               max1=Integer.max(maxsofar,nums[i]*arr[i-1]);
               arr[i]=max1;
               
           }

             int arr1[]=new int[nums.length];
            arr1[nums.length-1]=nums[nums.length-1];
            a=nums[nums.length-1];
            maxsofar=a;
              for(int i=nums.length-2;i>=0;i--){
               a*=nums[i];
                  if(a==0){
                      a=nums[i];
                  }
               maxsofar=Integer.max(a,nums[i]);
               max1=Integer.max(maxsofar,nums[i]*arr1[i+1]);
               arr1[i]=max1;
               
           }
            
            Arrays.sort(arr);
            Arrays.sort(arr1);
            return Integer.max(arr1[nums.length-1],arr[nums.length-1]);
            
            
        }
    }
     
