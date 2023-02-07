public class remove_consecutive {
    
}

class Solution{
    public String removeConsecutiveCharacter(String S){
        int a=0;
        String s=Character.toString(S.charAt(0));
        for(int i=1;i<S.length();i++){
            if(S.charAt(i)==S.charAt(i-1)){
                continue;
            }else{
                s+=S.charAt(i);
            }
        }
        return s;
    }
}
