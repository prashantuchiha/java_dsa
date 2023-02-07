import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> myList = new ArrayList<>();
      



        int a,b,c;
        int prev=Integer.MIN_VALUE;
        a=prev;
        Arrays.sort(nums);
        List<List<Integer>> lst=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                return lst;
            }
            if(nums[i]==0){
                if(nums.length-i>=3){
                    if(nums[i+1]==0 && nums[i+2]==0){
                        lst.add(Arrays.asList(0,0,0));
                    }
                }
                return lst;
            }
            if(i==0){
                a=nums[i];
                prev=a;
            }else if(prev!=nums[i]){
                a=nums[i];
                prev=a;
            }else{
                continue;
            }
            int sum=-a;
            int l=i+1;
            int h=nums.length-1;
            int back=Integer.MIN_VALUE;
            int back1=Integer.MIN_VALUE;
            while(l<h){
                if(nums[h]==back){
                        h--;
                        continue;
                    }
                    if(nums[l]==back1){
                        l++;
                        continue;
                    }
                int ap=nums[l]+nums[h];
                if(ap>sum){
                    back=nums[h];
                    h--;
                }else if(ap<sum){
                    back1=nums[l];
                    l++;
                }else{
                    lst.add(Arrays.asList(a,nums[l],nums[h]));
                    back=nums[h];
                    back1=nums[l];
                    // System.out.println(a+" "+nums[l]+" " +nums[h]);
                    h--;
                    l++;
                }
                
            }
        }
        return lst;
    }























        Arrays.sort(nums);
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                a=i;
            }
           
        }
        
        int curr=0;
        int zero=0;
        int low=1;
        int high=nums.length-1;
        int b=0;
        int f=0;
        int p=0;
        for(int i=0;i<nums.length;i++){


            if(i==0){
                p=nums[0];
                b=nums[0];
                f=nums[nums.length-1];
            }else{
                b=nums[]
            }

            if(nums[i]>0){
                return myList;
            }
            else if(nums[i]==0){
                zero+=1;
                if(zero==3){
                    myList.add(Arrays.asList(0,0,0));
                }
            }

            curr=nums[i];
            low=i+1;
            high=nums.length-1;
            while(low<high){
                if(nums[low]==b){
                    low+=1;
                }if(nums[high]==f){
                    high-=1;
                }
                if(curr+nums[low]+nums[high]==0){
                    myList.add(Arrays.asList(curr,nums[low],nums[high]));
                }
                else if(curr+nums[low]+nums[high]>0){
                    high-=1;
                }else{
                    low+=1;
                }
            }
            
        }









        for(int i=0;i<a;i++){
            curr=nums[i];
            int low=a;
            int high=nums.length-1;
            while(low<high){
                if(curr+nums[low]+nums[high]==0){
                    List<Integer> data=new ArrayList<>();
                    data.add(curr);
                    data.add(nums[low]);
                    data.add(nums[high]);
                    myList.add(data);
                }
                else if(curr+nums[low]+nums[high]>0){
                    high-=1;
                }else{
                    low+=1;
                }
            }
            
        }


        for(int i=a;i<nums.length;i++){
            curr=nums[i];
            int low=0;
            int high=a-1;
            while(low<high){
                if(curr+nums[low]+nums[high]==0){
                    List<Integer> data=new ArrayList<>();
                    data.add(curr);
                    data.add(nums[low]);
                    data.add(nums[high]);
                    myList.add(data);
                }
                else if(curr+nums[low]+nums[high]>0){
                    high-=1;
                }else{
                    low+=1;
                }
            }
            
        }
        return myList;
  }


























































//    static void combinationUtil(int arr[], int data[], int start,
//                                 int end, int index, int r,List<List<Integer>> myList)
//     {
//         if (index == r)
//         {
//             // for (int j=0; j<r; j++)
//             //     System.out.print(data[j]+" ");
//             // System.out.println("");
            
//             List<Integer> al =IntStream.of(data).boxed().collect(Collectors.toList());
//             myList.add(al);
             
//             return;
//         }
 
//         for (int i=start; i<=end && end-i+1 >= r-index; i++)
//         {
//             // data.add(arr[i]);
//             data[index] = arr[i];
//             combinationUtil(arr, data, i+1, end, index+1, r, myList);
//             // return;
           
//         }
//     }
 
//     static void printCombination(int arr[], int n, int r,List<List<Integer>> myList)
//     {
//         // int data[]=new int[r];
//         // List<Integer> data=new ArrayList<>();
//         int data[]=new int[r];
//         combinationUtil(arr, data, 0, n-1, 0, r,myList);
//     }
    
    
    
    
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> myList = new ArrayList<>();
//         printCombination(nums, nums.length, 3,myList);
     
        
        
        
        
//          for(int i=0;i<myList.size();i++){
//         int a=0;
//         for(int j=0;j<3;j++){
//            a=a+myList.get(i).get(j);
//         }
//         if(a!=0){
//             myList.remove(myList.get(i));
//             }
//         }
        
//         return myList;
//     }
}