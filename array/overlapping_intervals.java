import java.util.*;
public class overlapping_intervals {
    Arrays.sort(array, Comparator.comparingDouble(o -> o[0]));
}




class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here // Code here
       
        // Arrays.sort(Intervals, Comparator.comparingDouble(o -> o[0]));
        Arrays.sort(Intervals, new Comparator<int[]>() {
            
          @Override              
          // Compare values according to columns
          public int compare(final int[] entry1, 
                             final int[] entry2) {
  
            // To sort in descending order revert 
            // the '>' Operator
            if (entry1[0] > entry2[0])
                return 1;
            else
                return -1;
          }
        }); 
        
        
        int a=0;
        for(int i=1;i<Intervals.length;i++){
            if(Intervals[a][1]>=Intervals[i][0]){
                Intervals[a][1]=Integer.max(Intervals[a][1],Intervals[i][1]);
            }
            else{
                a+=1;
                 Intervals[a] = Intervals[i];
            }
        }
        
        
         int[][] integer2 = new int[a+1][];
        for(int i=0;i<=a;i++){
            integer2[i]=Intervals[i];
        }
        
        return integer2;
        
        
    }
}








public static int[][] overlappedInterval(int[][] arr)
    {
        if(arr.length==1){
            return arr;
        }
        Arrays.sort(arr,new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
            
        });
        int[][]ans=new int[arr.length][2];
        int a,b;
        a=arr[0][0];
        b=arr[0][1];
        int cnt=0;
        for(int i=1;i<arr.length;i++){
            if(b>=arr[i][0]){
                if(b<arr[i][1]){
                    b=arr[i][1];
                }
                if(i==arr.length-1){
                    ans[cnt][0]=a;
                    ans[cnt][1]=b;
                    cnt++;
                }
            }else{
                ans[cnt][0]=a;
                ans[cnt][1]=b;
                cnt++;
                a=arr[i][0];
                b=arr[i][1];
                if(i==arr.length-1){
                    ans[cnt][0]=a;
                    ans[cnt][1]=b;
                    cnt++;
                }
                
            }
        }
        int ans1[][]=new int[cnt][2];
        for(int i=0;i<ans1.length;i++){
            ans1[i][0]=ans[i][0];
            ans1[i][1]=ans[i][1];
        }
        return ans1;
    }
