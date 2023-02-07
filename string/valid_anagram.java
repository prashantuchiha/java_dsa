import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        char tempArray[] = s.toCharArray();
        Arrays.sort(tempArray);
        s= new String(tempArray);
 

        tempArray = t.toCharArray();
        Arrays.sort(tempArray);
        t= new String(tempArray);

        if(s.compareTo(t)==0){
            return true;
        }else{return false;}
 
    }
}



class Solution {
    public boolean isAnagram(String s, String t) {
     
     HashMap<Character, Integer> charCountMap
            = new HashMap<Character, Integer>();
 
 
        char[] strArray = s.toCharArray();
 
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }
 
        strArray = t.toCharArray();
 
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) - 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }


         for (Map.Entry entry : charCountMap.entrySet()) {
             if(entry.getValue().equals(0)){
                 continue;
             }else{
                 return false;
             }
            
        }
        return true;
 
    }
}




class Solution {
    public boolean isAnagram(String s, String t) {
     
        int a[]=new int[26];
        int b[]=new int[26];
        if(s.length()!=t.length()){
            return false;
        }else{
            for(int i=0;i<s.length();i++){
                a[s.charAt(i)-97]+=1;
                b[t.charAt(i)-97]+=1;

            }

             for(int i=0;i<a.length;i++){
                 System.out.print(a[i]+' '+b[i]);
                 if(a[i]!=b[i]){
                     return false;
                 }

            }

        }
        return true;
    }
}