import java.util.ArrayList;
import java.util.List;

public class commonlengths {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
         // code here 
         int a=0;
         int b=0;
         int c=0;
         ArrayList  list=new ArrayList<>();
         while(a<n1 && b<n2 && c<n3){
             if(A[a]==B[b] && A[a]==C[c]){
                 if(!list.contains(A[a])){
                 list.add(A[a]);}
                 a++;
                 b++;
                 c++;
             }else{
                 if(A[a]>=B[b] && A[a]>=C[c]){
                     
                     if(B[b]>C[c]){
                         c++;
                     }else if(B[b]<C[c]){
                         b++;
                     }else{c++;
                         b++;
                     }
                     
                     
                    
                 }else if(A[a]<=B[b] && B[b]>=C[c]){
                   
                      if(A[a]>C[c]){
                         c++;
                     }else if(A[a]<C[c]){
                         a++;
                     }else{c++;
                         a++;
                     }
                     
                   
                   
                 }else if(C[c]>=A[a] && C[c]>=B[b]){
                     
                        if(B[b]>A[a]){
                         a++;
                     }else if(B[b]<A[a]){
                         b++;
                     }else{a++;
                         b++;
                     }
                     
                   
                 }
             }
 
         }
         return list;


        
    }
}
