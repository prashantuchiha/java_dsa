public class container_with_most_water {
    
}
class Solution {
    public int maxArea(int[] height) {
        int a=0;
        int b= height.length-1;
        int ans=0;
        while(a<b){
            int c=Integer.min(height[a],height[b]);
            ans=Integer.max(ans,(b-a)*c);
            if(c==height[a]){
                a+=1;
            }else{b-=1;}
        }
        return ans;
    }
    
}