import java.util.Arrays;

public class merge_withoutspace {
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int a1=n-1;
        int a2=0;
        while(a1>=0 && a2<m){
            if(arr1[a1]>arr2[a2]){
                long x=arr2[a2];
                arr2[a2]=arr1[a1];
                arr1[a1]=x;
                a1--;
                a2++;
            }else{break;}
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
    }
}
