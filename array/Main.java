//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String printLargest(String[] arr) {
        // code here
        sort(arr, 0, arr.length - 1);
        String q="";
        for(int i=arr.length-1;i>=0;i--){
           q=q+arr[i];
            // q.concat(arr[i]);
        }
        return q;
    }

    static void merge(String arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        String L[] = new String[n1];
        String R[] = new String[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {

        // int a=L[i].length();
        // int b= R[j].length();
        int c=0;
        int d=0;
        // if(a>b){
        //     c=Integer.parseInt(L[i]);
        //     d=Integer.parseInt( R[j]);
        //     int rem=d%10;
        //     String z=String.valueOf(d);
        //     String v=R[j];
        //     Character re=z.charAt(z.length()-1);
        //     for(int p=0;k<a-b;p++){
        //         v=v+z;
        //         // z.concat(String.valueOf(re));
        //     }
        //     d=Integer.parseInt(z);
        // }else if(a<b){
        //     c=Integer.parseInt(L[i]);
        //     d=Integer.parseInt(R[j]);
        //     int rem=c%10;
        //     String z=String.valueOf(c);
        //     String v=L[i];
        //     Character re=z.charAt(z.length()-1);
        //     for(int p=0;k<a-b;p++){
        //         v=v+z;
        //     }
        //     c=Integer.parseInt(z);
        // }else if(a==b){
        //     c=Integer.parseInt(L[i]);
        //     d=Integer.parseInt(R[j]);
        // }
        String a=L[i]+R[j];
        String b=R[j]+L[i];
        c=Integer.parseInt(a);
        d=Integer.parseInt(b);
        for(int p=0;p<a.length();p++){
            if(Integer.parseInt(String.valueOf(a.charAt(p)))>Integer.parseInt(String.valueOf(b.charAt(p)))){
                c=2;
                d=0;
                break;
            }else if(Integer.parseInt(String.valueOf(a.charAt(p)))<Integer.parseInt(String.valueOf(b.charAt(p)))){
                c=0;
                d=2;
                break;
            }else{
                continue;
            }
        }




            if (c <= d) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    static void sort(String arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }






















static void swap(String[] arr, int i, int j)
{
    String temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

static int partition(String[] arr, int low, int high)
{
   
    String pivot = arr[high]; 
 
    int i = (low - 1); 
  
    for(int j = low; j <= high - 1; j++)
    {
        int a=arr[j].length();
        int b=pivot.length();
        int c=0;
        int d=0;
        if(a>b){
            c=Integer.parseInt(arr[j]);
            d=Integer.parseInt(pivot);
            int rem=d%10;
            String z=String.valueOf(d);
            String m=pivot;
            Character re=z.charAt(z.length()-1);
            for(int k=0;k<a-b;k++){
                m=m+z;
                z.concat(String.valueOf(re));
            }
            d=Integer.parseInt(z);
        }else if(a<b){
            c=Integer.parseInt(arr[j]);
            d=Integer.parseInt(pivot);
            int rem=c%10;
            String z=String.valueOf(c);
            Character re=z.charAt(z.length()-1);
            for(int k=0;k<a-b;k++){
                z.concat(String.valueOf(re));
            }
            c=Integer.parseInt(z);
        }else if(a==b){
            c=Integer.parseInt(arr[j]);
            d=Integer.parseInt(pivot);
        }
   
        if (c<d) 
        {
            i++; 
            swap(arr, i, j);
        }
       
    }
    swap(arr, i + 1, high);
    return (i + 1);
}
  

static void quickSort(String[] arr, int low, int high)
{
    if (low < high) 
    {
    
        int pi = partition(arr, low, high);
  
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
}