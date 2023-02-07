public class trapping_rainwater {
    static class Solution {
        public int trap(int[] height) {
            // int high[]=new int[height.length];
            // high[high.length-1]=0;
            // for(int i=high.length-2;i>=0;i--){
            //     high[i]=Integer.max(high[i+1],height[i+1]);
            // }

            // for(int i=0;i<high.length;i++){
            //     System.out.print(high[i]+" ");
            // }
            // System.out.println("");

            // int a=Integer.min(height[0],high[0]);
            // // System.out.println(a);
            // int ans=0;

            // for(int i=1;i<height.length-1;i++){
            //     if(height[i]>a){
            //         a=Integer.min(height[i],high[i]);
            //     }
            //     else{
            //         ans+=a-height[i];
            //      System.out.println(ans);
            //     }
                
            // }

            //  System.out.println(ans);




            int first[]=new int[height.length];
            int last[]=new int[height.length];
            int a=0;
            int b=0;
            int ans=0;
            for(int i=0;i<height.length;i++){
                a=Integer.max(a,height[i]);
                first[i]=a;
            }
            a=0;
            // int ans=0;
            for(int i=height.length-1;i>=0;i--){
                a=Integer.max(a,height[i]);
                first[i]=Integer.min(a,first[i]);
            }
            // for(int i=0;i<first.length;i++){
            //     first[i]=Integer.min(first[i],last[i]);
            // }



                // for(int i=0;i<first.length;i++){
                //     a=Integer.max(a,height[i]);
                //     b=Integer.max(b,height[height.length-i-1]);
                //     first[i]=Integer.min(a,);
                // }


            for(int i=0;i<first.length;i++){
                if(first[i]>height[i]){
                    ans+=first[i]-height[i];
                }
            }
             System.out.println(ans);



            return ans;
        }
    }
    public static void main(String[] args) {
        

        int height[]={5,4,1,2};
        Solution ob=new Solution();
        ob.trap(height);
        // new trapping_rain_water.Solution.trap(heigth);
    }

    
}
