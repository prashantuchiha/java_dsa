public class longets_common_prefix {
    
}



class Solution {

    public String Answer(String a,String b){
        String ans="";
        int s=Integer.min(a.length(),b.length());
        for(int i=0;i<s;i++){
            if(a.charAt(i)==b.charAt(i)){
                ans+=a.charAt(i);
            }else{
                break;
                
            }
        }return ans;

    }
    public String longestCommonPrefix(String[] strs) {
        String ans=strs[0];
        for(int i=1;i<strs.length;i++){
           
                ans=Answer(ans,strs[i]);
            
        }
        return ans;
    }
}
