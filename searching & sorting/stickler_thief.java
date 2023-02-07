public class stickler_thief {
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int arr1[]=new int[n];
        int ans=0;
        if(n==1){return arr[0];}
        if(n==2){return Integer.max(arr[0],arr[1]);}
        for(int i=1;i<n-1;i++){
            if(arr[i]>=arr[i-1]+arr[i+1]){
                arr1[i]=1;
            }else{
                arr1[i]=0;
            }
        }
        if(arr[1]>arr[0]){arr1[0]=0;}else{arr1[0]=1;}
        if(arr[n-2]>arr[n-1]){arr1[n-1]=0;}else{arr1[n-1]=1;}

        for(int i=1;i<n-1;i++){
            
            if( arr1[i]==1){
                ans+=arr[i];
            }else if( arr1[i]==0 && arr1[i-1]==0 && arr1[i+1]==0){
                arr1[i]=1;
                ans+=arr[i];
            }
        }
        if(arr1[1]==0){ans+=arr[0];}
        if(arr1[n-2]==0){ans+=arr[n-1];}
        return ans;
        
    }
}
