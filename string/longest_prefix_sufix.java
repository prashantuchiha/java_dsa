import java.util.ArrayList;

import java.util.ArrayList;
public class longest_prefix_sufix {

    class Solution {
        int lps(String s) {
            // code here
            int ans=0;
            // String a=s.substring(0, s.length()-1);
            // String b=s.substring(1, s.length());
            // int c=b.length()-1;
            // for(int i=a.length()-1;i>=0;i--){
            //     if(a.charAt(i)!=b.charAt(c) & i!=0){
            //         ans=0;
            //         c=b.length()-1;
            //     }else{
            //         ans++;
            //         c--;
            //     }
            // }


            ArrayList list=new ArrayList<>();

                for(int i=1;i<s.length();i++){
                    if(s.charAt(i)==s.charAt(0)){
                        String a=s.substring(i);
                        int q=a.length();
                        String b=s.substring(0,q);
                        if(a.equals(b)){
                            ans=q;
                            break;
                        }
                    }
                }

            return ans;
        }
    }
    public static void main(String[] args) {
        
    }
}
