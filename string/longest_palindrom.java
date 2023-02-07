class Solution {
    public String longestPalindrome(String s) {
         int k=2;
        int l=0;
        int r=0;
       
        int[][] arr = new int[s.length()][s.length()];
         for(int i=0;i<s.length();i++){
            arr[i][i]=1;
        }
        while(k<=s.length()){
            for(int i=0;i<=s.length()-k;i++){
                if(s.charAt(i)==s.charAt(i+k-1)){
                    if(arr[i+1][i+k-2]==1 | i+1>i+k-2){
                        l=i;
                        r=i+k-1;
                        arr[i][i+k-1]=1;
                    }
                }
            }
            k++;
        }
        return s.substring(l, r+1);
    }
}