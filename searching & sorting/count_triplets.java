import java.util.Arrays;

public class count_triplets {
    long countTriplets(long arr[], int n,int sum)
    {
       
        Arrays.sort(arr);int count=0;
        int d=0;
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]+arr[i+1]+arr[i+2]>=sum){d=i;break;}
        }
        if (d==0){d=arr.length-2;}
        for(int i=0;i<d;i++){
            int l=i+1;int r= n-1;
            while(l<r){
              
                if(arr[i]+arr[l]+arr[r]<sum){
                    count+=r-l;
                    l++;
                    r=n-1;
                    
                }else if(arr[i]+arr[l]+arr[r]>=sum){
                    
                    r--;
                }
                
            }
        }
        return count;
    
    }
}
