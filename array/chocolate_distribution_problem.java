
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<a.size()-m+1;i++){
            arr.add(a.get(i+m-1)-a.get(i));
            
            
        }
        Collections.sort(arr);
        // for(int i=0;i<arr.size();i++){
        //     System.out.println(arr.get(i));
        // }
        return arr.get(0);
        
    }
}



