public class merge_pallindrome {
    public static void main(String[] args) {
        int[] arr={11, 14, 15, 99};



        int ans=0;
        int l=0;
        int e=arr.length-1;
        while(l<e){
            if(arr[l]==arr[e]){
                l+=1;
                e-=1;
            }else if(arr[l]>arr[e]){
                ans+=1;
                arr[l+1]+=arr[l];
                l+=1;
            }else{
                ans+=1;
                arr[e-1]+=arr[e];
                e-=1;
            }
        }
        System.out.println(ans);

    }
}
