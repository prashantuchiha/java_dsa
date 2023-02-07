public class convert_numeric {
    
}


class Solution 
{ 
    String printSequence(String S) 
    { 
        // code here
  
         String s="";
        for(int i=0;i<S.length();i++){
           
            int a=S.charAt(i)-64;
                if(a==-32){
                    s+="0";
                }
                else if(a<16){
                    if(a%3==0){
                        int z=a/3+1;
                        String d=Integer.toString(z);
                        s=s+d+d+d;
                    }else if(a%3==1){
                        int z=a/3+2;
                        String d=Integer.toString(z);
                        s=s+d;
                        
                    }else if(a%3==2){
                        int z=a/3+2;
                        String d=Integer.toString(z);
                        s=s+d+d;
                    }
                
                    
                }
                else if(a<20){
                    int z=a%4;
                    if(z==0){
                        s+="7";
                    }else if(z==1){
                        s+="77";
                    }else if(z==2){
                        s+="777";
                    }else{
                        s+="7777";
                    }
                    
                    
                }else if(a<23){
                    if(a==20){
                        s+="8";
                    }else if(a==21){
                        s+="88";
                    }else{s+="888";}
                    
                }else{
                     if(a==23){
                        s+="9";
                    }else if(a==24){
                        s+="99";
                    }else if(a==25){s+="999";}
                    else{s+="9999";}
                    
                }
                
                
            
            
            }
            return s;
        }
    }

