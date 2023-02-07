public class replaceO {



public static void replace(char a[][],int n,int m,int matrix[][],int x,int y){
    if(x<0 || y<0 || x==n || y==m ||  a[x][y]=='X' || a[x][y]=='$'){
        return;
    }
    if(a[x][y]=='O'){
        a[x][y]='$';
    }
    
    replace(a,n,m,matrix,x-1,y);
    replace(a,n,m,matrix,x,y-1);
    replace(a,n,m,matrix,x+1,y);
    replace(a,n,m,matrix,x,y+1);
    return;


}

    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        int[][] matrix=new int[n][m];
        
        
        
       for(int i=0;i<n;i++){
            if(a[i][0]=='O'){
                replace(a,n,m,matrix,i,0);
            }
            if(a[i][m-1]=='O'){
               replace(a,n,m,matrix,i,m-1);
            }
        }
        for(int i=0;i<m;i++){
            if(a[0][i]=='O'){
               replace(a,n,m,matrix,0,i);
            }
            if(a[n-1][i]=='O'){
                replace(a,n,m,matrix,n-1,i);
            }
        }
        
 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]=='$'){
                    a[i][j]='O';
                }else if(a[i][j]=='O'){
                    a[i][j]='X';
                }
            }
        }
        return a;
    }
}
