class Solution {
    public boolean isPalindrome(String s) {
        String a="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' & s.charAt(i)<='z' || s.charAt(i)>='0' & s.charAt(i)<='9'){
                a=a+s.charAt(i);
            }else if(s.charAt(i)>='A' & s.charAt(i)<='Z'){
                a=a+ Character.toLowerCase(s.charAt(i));
            }
            // }else if(s.charAt(i)>='0' & s.charAt(i)<='9'){
            //     a=a+s.charAt(i);
            // }
        }
        int v=0;
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(a.length()-i-1)){
                v=1;
                break;
            }
        }
        if(v==0){
            return true;
        }else{
            return false;
        }
    }
}