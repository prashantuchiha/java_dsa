class countSort
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        // code here

        int[] arr1=new int[26];
        for(int i=0;i<arr.length();i++){
            
            arr1[arr.charAt(i)-'a']++;
        }
        String ans="";
        for(int i=0;i<arr1.length;i++){
            String a=((char)i+'a')+"";
            ans+=(a.repeat(arr1[i]));
        }
        return ans;
    }

    
}