public class arraysum_divisible_k {
    static class Solution {
        static int longSubarrWthSumDivByK(int a[], int n, int k) {
            // Complete the function
            for (int i = 0; i < a.length; i++) {
                a[i] = a[i] % k;
            }
            int prevpoint = 0;
            int currpoint = 0;
            int ans = 0;
            int sum = 0;
            int ans2=0;
            // for(int i=0;i<a.length;i++){
            // System.out.println(a[i]);
            // }
            int sumpre=0;
            int point=0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
                sumpre+=a[i];
                if(sumpre%3==0){
                    ans2=Integer.max(ans2,i-point+1);
                }
                if(a[i]==0){
                    ans+=1;
                }
                if (sum % 3 == 0) {
                    ans = Integer.max(ans, currpoint - prevpoint + 1);
                    sumpre=sum;
                    point=prevpoint;
                    prevpoint = i;
                    currpoint = i;
                    sum = a[i];
                    // System.out.println(ans);
                } 
                // System.out.println(sum+" "+currpoint+" "+prevpoint);
                currpoint += 1;
                    
                
            }

            ans=Integer.max(ans,ans2);


            int ans1=0;
            sumpre=0;
            point=0;
            ans2=0;
            prevpoint = a.length-1;
            currpoint =  a.length-1;
            sum=0;
            for (int i = a.length-1; i>=0; i--) {
                sum += a[i];
                sumpre+=a[i];
                if(sumpre%3==0){
                    ans2=Integer.max(ans2,point-i+1);
                }
                if (sum % 3 == 0) {
                    ans1 = Integer.max(ans1,  prevpoint-currpoint + 1);
                    sumpre=sum;
                    point=prevpoint;
                    prevpoint = i;
                    currpoint = i;
                    sum = a[i];
                    // System.out.println(ans1);
                } 
                // System.out.println(sum+" "+currpoint+" "+prevpoint);
                currpoint -= 1;
                    
                
            }
            ans1=Integer.max(ans1,ans2);
            return Integer.max(ans1, ans);

        }

    }

    public static void main(String[] args) {
        int a[] = {8 ,18, 8, 18 ,16, 7 ,4, 2 ,18, 16, 16, 3};
        int K = 3;
        int r = Solution.longSubarrWthSumDivByK(a, 6, 3);
        System.out.println(r);

    }
}
