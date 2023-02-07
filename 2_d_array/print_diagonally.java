import java.util.ArrayList;

class print_diagonally{
    static void downwardDigonal(int N, int A[][])
    {
        // code here 
        ArrayList list=new ArrayList<>();
        for(int i=0;i<N;i++){
            int j=0;
            int k=i;
            while(k>=0){
                System.out.print(A[j][k] +" ");
                j++;
                k--;
            }
            System.out.println("");
        }
        int i=1;
        while(i<=N){
            
            int j=i;
            int k=N-1;
            while(k>=i-1){
                System.out.print(A[j][k]+" ");
                j++;
                k--;
            }
            i++;
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        int M[][] = {
            { 1, 2, 3, 4 },     { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },  { 13, 14, 15, 16 },
            { 17, 18, 19, 20 },
        };
        downwardDigonal(4, M);



    }
}

