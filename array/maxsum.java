import java.lang.Math;
class Solution {
    public int maxSubArray(int[] nums) {
        int a=0;
        int sum=0;
        ArrayList<Integer> arrli 
            = new ArrayList<Integer>(); 
        int x=0;
        int c=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                x=1;
                break;
            }else{
                c=Math.max(c,nums[i]);
            }
            
        }
        
        int w=0;
          for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                sum=0;
                w=1;
                break;
            }else{
                sum+=nums[i];
            }
            
        }
        
        if(w==0){
            return sum;
        }
        
        
        if(x==0){
            return c;
        }
        int n=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]<0){
                a=sum-nums[i];
                // arr[n]=a;
                // n+=1;
                arrli.add(a);
                
            }
            if(sum<0){
                
                sum=0;
            }
        }
        arrli.add(sum);
        int r=arrli.get(0);
        for(int i=0;i<arrli.size();i++){
            r=Math.max(r,arrli.get(i));
        }
        return r;
        
        
        // arr[n+1]=sum;
//         if(sum>a){
//             return sum;

//         }
//         else{
//             return a;
//         }
        // int q=arr[0];
        // for(int i=0;i<arr.length;i++){
        //     q=Math.max(q,arr[i]);
        // }
        // return q;
    }
}