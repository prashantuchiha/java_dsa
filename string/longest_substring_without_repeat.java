import java.util.HashMap;

public class longest_substring_without_repeat {


    public static int lengthOfLongestSubstring(String s) {
            
        HashMap<Character, Integer> charCountMap
           = new HashMap<Character, Integer>();


       int a=0;
       int ans=0;

       for(int i=0;i<s.length();i++){

           if(charCountMap.containsKey(s.charAt(i)) && charCountMap.get(s.charAt(i))>=a){
               ans=Integer.max(ans,i-a);
               a=charCountMap.get(s.charAt(i))+1;
               charCountMap.put(s.charAt(i), i);
               System.out.println(ans+" "+i);

           }else if(i==s.length()-1){
            ans=Integer.max(ans,i-a+1);
            
           }
           else {
               charCountMap.put(s.charAt(i), i);
           }
       }
       if(ans==0){
        ans=s.length();
       }
       return ans;

   }
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
