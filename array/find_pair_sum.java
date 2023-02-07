import java.util.* ;
import java.io.*; 
public class find_pair_sum 
{
	public static boolean findPairSum(int[] arr, int target) 
	{
		// Write your code here
        int a=0;
        int low=0;
        int b=0;
        int high=arr.length-1;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                a=i+1;
                break;
            }
        }
            if(a!=0){
                low=a;
                high=a-1;
            }
            while(low!=high){
                b=arr[low]+arr[high];
                if(b==target){
                    return true;
                }else if(b>target ){
                    high-=1;
                }else if(b<target ){
                    low+=1;
                }if(high<0){
                    // low=0;
                    high=arr.length-1;
                }if(low>=arr.length){
                    low=0;
                    // high=arr.length-1;
                }

                


            }

        return false;
	}



    public static void main(String[] args) {
        int arr[]={5, 7 ,9 ,1, 3};
        // System.out.println("hello");
        find_pair_sum obj=new find_pair_sum();
       if(findPairSum(arr, 16)){
        System.out.println("true");
       }else{
        System.out.println("false");
       }
    }
}