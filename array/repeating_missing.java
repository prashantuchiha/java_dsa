public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int arr[]=new int[A.length+1];
        int a=0;
        int b=0;
        for(int i=0;i<A.length;i++){
            arr[A[i]]+=1;
        
        
        
            // if(arr[A[i]])
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==2){
                a=i;
            }else if(arr[i]==0){
                b=i;
            }
        }
        int aq[]={a,b};
        return aq;
        
    }
}
