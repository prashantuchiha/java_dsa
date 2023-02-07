import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class nxtpermu {
    public static int nummber(int[]num){
        String s="";
        for(int i=0;i<num.length;i++){
            s+=num[i];
        }
        return (Integer.parseInt(s));
    }
    public static int binarySearch(int v[], int To_Find){
        int lo = 0, hi = v.length - 1;
        while (hi - lo > 1) {
            int mid = (hi + lo) / 2;
            if (v[mid] < To_Find) {
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }
        if (v[lo] == To_Find) {
            return(lo);
        }
        else if (v[hi] == To_Find) {
            return(hi);
        }
        else{
            return(-1);
        }
    }
    // Returns index of x if it is present in arr[],
    // else return -1
    public static int BinarySearch(List<Integer> app, int x)
    {
        int left = 0, right = app.size() - 1;
       
        while (left <= right)
        {
            int mid = left + (right - left) / 2;
   
            // Check if x is present at mid
            if (app.get(mid) == x)
                return mid;
   
            // If x greater, ignore left half
            if (app.get(mid) < x)
                left = mid + 1;
   
            // If x is smaller, ignore right half
            else
                right = mid - 1;
        }
   
        // if we reach here, then element was
        // not present
        return -1;
    }
    public void nextPermutation(int[] nums) {
        int z=nums.length;
        int[] ans = Arrays.copyOfRange(nums, 0, z);
        int[] srted = Arrays.copyOfRange(nums, 0, z);
        Arrays.sort(srted);
        int p=z-2;
        while(p>=0){
            int n = nums[p];
            int ind = binarySearch(srted,n);
            if (z-p==2){
                int q = ans[p+1];
                ans[p+1]=ans[p];
                ans[p]=q;
                int num1=nummber(ans);
                int num2=nummber(nums);
                if( num1 > num2){
                    for(int i=0;i<z;i++){
                        System.out.print(ans[i]+" ");
                    }
                    return;
                }
                int r = ans[p+1];
                ans[p+1]=ans[p];
                ans[p]=r;
            }
            else if(z-p>=2){
                int pkanum=0;
                List<Integer> app = new ArrayList<>();
                for(int i=p;i<z;i++){
                    app.add(nums[i]);
                }
                Collections.sort(app);;
                int flag=0;
                for(int i=ind+1;i<z;i++){
                    int pqr=BinarySearch(app,srted[i]);
                    if(pqr==-1){
                        flag=1;
                        continue;
                    }
                    else{
                        pkanum=srted[i];
                        flag=0;
                        break;
                    }
                }
                if(flag==0){
                    int g =app.indexOf(pkanum);
                    app.remove(g);
                    for(int i=0;i<p;i++){
                        ans[i]=nums[i];
                    }
                    ans[p]=pkanum;
                    for(int i=0;i<app.size();i++){
                        ans[p+i+1]=app.get(i);
                    }
                }
                // else if(flag==1){
                //     p-=1;
                //     continue;
                // }
            }
            if(nummber(ans)>nummber(nums)){
                for(int i=0;i<z;i++){
                    System.out.print(ans[i]+" ");
                }
                return;
            }
            p-=1;
        }
        if(p==-1){
            Arrays.sort(nums);
            for(int i=0;i<z;i++){
                System.out.print(nums[i]+" ");
            }
        }
    } 
    public static void main(String[] args) {
        nxtpermu a = new nxtpermu();
        int arr[]={4,2,5,7,4,3,2,1};
        a.nextPermutation(arr);
    }
}